/**
 * 
 */
package com.globalapps.web.login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.globalapps.web.common.action.BaseAction;

public class LogoutAction extends BaseAction {
	
	private static final String LOGOUT_SUCCESS_MESSAGE = "01";

	public ActionForward executeAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	   
	   ActionForward forward = mapping.findForward(WELCOME_FORWARD);
	   
		request.getSession(false).setAttribute(USER_SESSION_INFO, null);
	   request.setAttribute(MESSAGE_CODE, LOGOUT_SUCCESS_MESSAGE);
	   
	     
	   return forward;
	}
}
