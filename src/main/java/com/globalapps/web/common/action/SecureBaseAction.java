package com.globalapps.web.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.globalapps.web.common.bean.AppSession;
import com.globalapps.web.common.config.CommonConfigBean;



public abstract class SecureBaseAction extends BaseAction {
	
	
   public ActionForward executeAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	   ActionForward forward = mapping.findForward(WELCOME_FORWARD);
	   AppSession userSession = (AppSession) request.getSession(false).getAttribute(USER_SESSION_INFO);
	   
	   if(null != userSession){
		   
		   if(System.currentTimeMillis() - userSession.getLastResquetTime() <  Integer.parseInt(CommonConfigBean.getInstance().getParam("sessionInactiveExpirationTime")) ){
			   if(System.currentTimeMillis() - userSession.getCredential().getPassCodeGenerationTime() <  Integer.parseInt(CommonConfigBean.getInstance().getParam("sessionExpirationTime")) ){
				   forward =  executeSecureAction(mapping, form, request, response);
				   userSession.setLastResquetTime(System.currentTimeMillis());
			   }else{
				   request.setAttribute(ERROR_CODE, "06");
			   }
		   }else{
			   request.setAttribute(ERROR_CODE, "06");
		   }
		   
	   }else{
		   request.setAttribute(ERROR_CODE, "06");
	   }
	   return forward;
	   
   }
   public abstract ActionForward executeSecureAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
