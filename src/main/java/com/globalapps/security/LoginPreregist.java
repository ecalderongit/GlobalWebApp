package com.globalapps.security;

import javax.persistence.NoResultException;

import com.globalapps.common.exception.AuthenticationException;
import com.globalapps.common.exception.NotificationException;
import com.globalapps.notification.MailDelivery;
import com.globalapps.notification.MailMessage;
import com.globalapps.security.jpa.repository.CredentialRepository;

public class LoginPreregist {
	private static final int SECURITY_CODE_TEMPLATE_ID = 1;

	public Credential create(String email) throws AuthenticationException, NotificationException {
		CredentialRepository credentialRepo = new CredentialRepository();
		Credential credential = null;
		try{
			credential = credentialRepo.findByEmail(email);
			if(null == credential){
				throw new AuthenticationException(AuthenticationException.USER_DOESNT_EXIST_ERROR_CODE);
			}else{
				if(credential.getStatus().equals("A")){
					credential.setPassCode(SecureCode.create());
					credentialRepo.update(credential);
					
					 MailMessage message = new MailMessage();
					   message.addParam("securityCode", credential.getPassCodeAsString());
					   message.setSubject("Código de seguridad - Global Apps");
					   message.addReceiver(credential.getEmail());
					   MailDelivery mailDelivery = new MailDelivery();
					   mailDelivery.create(SECURITY_CODE_TEMPLATE_ID, message);
				}else{
					throw new AuthenticationException(AuthenticationException.USER_IS_LOCKED);
				}
			}
			credential.setPassCodeGenerationTime(System.currentTimeMillis());
			credential.setPassCode(0);
		} catch (NoResultException e) {
			throw new AuthenticationException(AuthenticationException.INVALID_ID_ERROR_CODE);
	    } 
		
		return credential;
	}
}
