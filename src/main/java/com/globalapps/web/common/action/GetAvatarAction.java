package com.globalapps.web.common.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalapps.security.Credential;

public class GetAvatarAction extends ImageGetterBaseAction {
	
   public void setImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
	   Credential credential = (Credential) request.getSession(false).getAttribute(USER_CREDENTIAL_KEY);
	   
	   response.getOutputStream().write(credential.getAvatar());
	  
   }
 
   
   
}
