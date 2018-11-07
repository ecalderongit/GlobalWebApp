package com.globalapps.web.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.globalapps.common.exception.AuthenticationException;
import com.globalapps.common.exception.NotificationException;
import com.globalapps.security.BlockUser;
import com.globalapps.security.Credential;
import com.globalapps.security.LoginPreregist;
import com.globalapps.web.common.action.BaseAction;
import com.globalapps.web.common.config.CommonConfigBean;
import com.globalapps.web.login.form.LoginForm;



public class PrepareLoginAction extends BaseAction {
	
   public ActionForward executeAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	   LoginForm loginForm = (LoginForm) form;
	   ActionForward forward = mapping.findForward(WELCOME_FORWARD);
	   Credential credential = null;
	   try{
		   
		   if(isNotARetry(loginForm)){
			   LoginPreregist loginPreregist = new LoginPreregist();
			   credential = loginPreregist.create(loginForm.getEmail());
			   
		   }else{
			   credential = (Credential) request.getSession(false).getAttribute(USER_CREDENTIAL_KEY);
			   if(null != credential){
				   if(credential.getRetryAccount() < Integer.parseInt(CommonConfigBean.getInstance().getParam("maxLoginRetry")) - 1 ){
					   credential.setRetryAccount(credential.getRetryAccount()+1);
					   request.setAttribute("errorCode", "07");
				   }else{
					   BlockUser blockUser = new BlockUser(); 
					   blockUser.create(credential);
					   throw new AuthenticationException(AuthenticationException.USER_IS_LOCKED);
				   }
				   
			   }else{
				   throw new AuthenticationException(AuthenticationException.USER_DOESNT_EXIST_ERROR_CODE);
			   }
			   
		   }
		   
		   request.setAttribute(USER_CREDENTIAL_KEY, credential);
		   request.getSession(false).setAttribute(USER_CREDENTIAL_KEY, credential);
		   forward = mapping.findForward("success");
		   
	   } catch (AuthenticationException e) {
		   request.setAttribute("errorCode", AuthenticationException.EXCEPTION_CODE + e.getCode());
	   } catch (NotificationException e) {
		   request.setAttribute("errorCode", NotificationException.EXCEPTION_CODE + e.getCode());
	   }
	   return forward;
	    
	     
   }

	private boolean isNotARetry(LoginForm loginForm) {
		return null != loginForm.getEmail();
	}


	
   
   
}
