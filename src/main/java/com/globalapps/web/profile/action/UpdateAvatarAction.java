package com.globalapps.web.profile.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


import com.globalapps.common.jpa.repository.DataBaseConnection;
import com.globalapps.security.Credential;
import com.globalapps.security.jpa.repository.CredentialRepository;
import com.globalapps.web.common.action.SecureBaseAction;
import com.globalapps.web.common.bean.AppSession;
import com.globalapps.web.profile.form.ProfileForm;


public class UpdateAvatarAction extends SecureBaseAction {

	@Override
	public ActionForward executeSecureAction(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		ProfileForm profileForm = (ProfileForm) form;
		AppSession userSession = (AppSession) request.getSession(false).getAttribute(USER_SESSION_INFO);
		
		CredentialRepository credentialRepo = new CredentialRepository();
		
		if(profileForm.getAvatar() != null & profileForm.getAvatar().getFileData().length != 0){
			userSession.getCredential().setAvatar(profileForm.getAvatar().getFileData());
		}else{
			userSession.getCredential().setAvatar(null);
		}
		
		credentialRepo.update(userSession.getCredential());
		
		return mapping.findForward(SUCCESS);
	}
}
