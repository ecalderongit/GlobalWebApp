package com.globalapps.web.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public abstract class ImageGetterBaseAction extends BaseAction {
	
   public ActionForward executeAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
	  
	   response.setContentType("image/png");
	   response.setHeader("Cache-Control", "no-store,no-cache,max-age=0");
	   response.setHeader("Pragma","no-cache");
	   
	   setImage(request, response);
	   
	   response.getOutputStream().flush();
	   
	   return null;
   }
   public abstract void setImage(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
