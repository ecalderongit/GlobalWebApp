package com.globalapps.web.common.action;

import java.io.File;
import java.nio.file.Files;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globalapps.common.jpa.repository.BaseRepository;
import com.globalapps.security.Credential;
import com.globalapps.web.common.bean.AppSession;
import com.globalapps.web.common.config.CommonConfigBean;

public class GetAvatarAction extends ImageGetterBaseAction {
	
   public void setImage(HttpServletRequest request, HttpServletResponse response) throws Exception {
	   
	   Credential credential = (Credential) request.getSession(false).getAttribute(USER_CREDENTIAL_KEY);
	   
	   if(credential == null){
		   
		   AppSession userSession = (AppSession) request.getSession(false).getAttribute(USER_SESSION_INFO);
		   credential = userSession.getCredential();
		   
	   }
	   
	   if(credential.getAvatar() == null){

		   response.getOutputStream().write(credential.getAvatar());

	   }
	   response.getOutputStream().write(credential.getAvatar());
   }

}
