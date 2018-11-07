package com.globalapps.security;

import com.globalapps.common.exception.AuthenticationException;
import com.globalapps.common.exception.NotificationException;
import com.globalapps.security.jpa.repository.CredentialRepository;

public class LoginRegist {

	public Credential create(Credential credential, Integer passCode) throws AuthenticationException, NotificationException {
		CredentialRepository credentialRepo = new CredentialRepository();
		Credential actualCredential;
		if(null == credential){
			throw new AuthenticationException(AuthenticationException.USER_DOESNT_EXIST_ERROR_CODE);
		}else{
			actualCredential = credentialRepo.findByEmail(credential.getEmail());
			if(actualCredential.getStatus().equals("A")){
				if(actualCredential.getPassCode() == passCode){
					actualCredential.setValid(Boolean.TRUE);
				}else{
					throw new AuthenticationException(AuthenticationException.DEFAULT_ERROR);
				}
			}else{
				throw new AuthenticationException(AuthenticationException.USER_IS_LOCKED);
			}
		}
		return actualCredential;
	}
	
	
}
