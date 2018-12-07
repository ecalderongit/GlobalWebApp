package com.globalapps.web.profile.form;

import java.io.File;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class ProfileForm extends ActionForm {
	
	private FormFile avatar;
	
	public FormFile getAvatar() {
		return avatar;
	}
	public void setAvatar(FormFile avatar) {
		this.avatar = avatar;
	}
}
