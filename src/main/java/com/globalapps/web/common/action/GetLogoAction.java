/**
 * 
 */
package com.globalapps.web.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class GetLogoAction extends ImageGetterBaseAction {
	
   public void setImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
	   byte[] logo = null;
	   
	  /* if(null != userSession.getCredential().getTributary()){
		   logo = userSession.getCredential().getTributary().getLogo();
	   } else {
		   int id = Integer.parseInt(request.getParameter("id"));
		   for(TributaryBean trib : userSession.getTributaryList()){
			   if(id == trib.getIdTributario()){
				   logo = trib.getLogo();
				   break;
			   }
		   }
	   }*/
	   response.getOutputStream().write(logo);
	  
   }

   
   
}
