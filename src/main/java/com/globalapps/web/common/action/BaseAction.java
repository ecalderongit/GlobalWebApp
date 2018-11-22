/**
 * 
 */
package com.globalapps.web.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class BaseAction extends Action {
	public static final String WELCOME_FORWARD = "welcome";
	public static final String USER_SESSION_INFO = "userSessionInfo";
	public static final String MESSAGE_CODE = "messageCode";
	public static final String ERROR_CODE = "errorCode";
	public static final String FAILURE = "failure";
	public static final String SUCCESS = "success";
	public static final String USER_CREDENTIAL_KEY = "credential";
	
   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	   
	   return executeAction(mapping, form, request, response); 
	   
   }
   public abstract ActionForward executeAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
