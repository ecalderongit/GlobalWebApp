package com.globalapps.security;

import com.globalapps.common.exception.AuthenticationException;
import com.globalapps.common.exception.NotificationException;
import com.globalapps.security.jpa.repository.CredentialRepository;

public class BlockUser {
	public void create(Credential credential) throws AuthenticationException, NotificationException {
		CredentialRepository credentialRepo = new CredentialRepository();
		credential.setStatus("B");
		credentialRepo.update(credential);
	}
}
