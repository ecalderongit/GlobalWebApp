package com.globalapps.web.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;



public class ShowHomeAction extends SecureBaseAction {
	
public ActionForward executeSecureAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	  ActionForward forward = mapping.findForward(FAILURE);
	  forward = mapping.findForward(SUCCESS);
	  return forward;
   }
}
