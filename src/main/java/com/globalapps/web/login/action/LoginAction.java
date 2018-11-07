package com.globalapps.web.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.globalapps.common.exception.AuthenticationException;
import com.globalapps.security.Credential;
import com.globalapps.security.LoginRegist;
import com.globalapps.web.common.action.BaseAction;
import com.globalapps.web.common.bean.AppSession;
import com.globalapps.web.common.config.CommonConfigBean;
import com.globalapps.web.login.form.LoginForm;



public class LoginAction extends BaseAction {
	
public ActionForward executeAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	   
	  LoginForm loginForm = (LoginForm) form;
	  ActionForward forward = mapping.findForward(FAILURE); 
	  Credential credential = (Credential) request.getSession(false).getAttribute(USER_CREDENTIAL_KEY);
	   
	   try{ 
		   
		   if(System.currentTimeMillis() - credential.getPassCodeGenerationTime() < Integer.parseInt(CommonConfigBean.getInstance().getParam("passCodeExpirationTime"))){
			   LoginRegist loginRegist = new LoginRegist();
			   credential = loginRegist.create(credential, loginForm.getSecurityCode());
			   if(credential.isValid()){
				   AppSession appSession = new AppSession();
				   appSession.setCredential(credential);
				   credential.setPassCodeGenerationTime(System.currentTimeMillis());
				   appSession.setLastResquetTime(System.currentTimeMillis());
				   request.getSession(false).setAttribute(USER_SESSION_INFO, appSession);
				   request.getSession(false).setAttribute(USER_CREDENTIAL_KEY, null);
				   forward = mapping.findForward(SUCCESS);
			   }else{
				   throw new AuthenticationException(AuthenticationException.AUTHENTICATION_ERROR);
			   }
		   }else{
			   forward = mapping.findForward(WELCOME_FORWARD);
			   throw new AuthenticationException(AuthenticationException.SECURITY_CODE_EXPIRED);
			   
		   }
		   
		   
	   }catch(AuthenticationException e){
		   request.setAttribute(ERROR_CODE, AuthenticationException.EXCEPTION_CODE + e.getCode());
	   } 
	   return forward;
   }
}
