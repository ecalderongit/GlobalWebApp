package com.globalapps.notification;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.globalapps.common.exception.NotificationException;
import com.globalapps.notification.jpa.repository.EmailTemplateRepository;

public class MailDelivery {
	public void create(int templateId, MailMessage message) throws NotificationException {
		try{
			MailServer config = MailServerConfig.getInstance().getMailServer();
		    Properties props = System.getProperties();
		    props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
		    props.put("mail.smtp.user", config.getEmisorMail());
		    props.put("mail.smtp.clave", config.getPass());    //La clave de la cuenta
		    props.put("mail.smtp.auth", true);    //Usar autenticación mediante usuario y clave
		    props.put("mail.smtp.starttls.enable", true); //Para conectar de manera segura al servidor SMTP
		    props.put("mail.smtp.port", config.getPort()); //El puerto SMTP seguro de Googlec
		    props.put("mail.smtp.ssl.trust", config.getSmtpmail());
		    
		    EmailTemplateRepository templateRepository = new EmailTemplateRepository();
		    Template template = templateRepository.find(templateId);
		    
		    String mailContend = new String(template.getContent());
		    
		    for (String key : message.getParams().keySet()) {
		    	mailContend = mailContend.replaceAll(key, message.getParams().get(key));
		    }
		    
		  
		    Session session = Session.getDefaultInstance(props);
		    MimeMessage mimeMessage = new MimeMessage(session);
		    mimeMessage.setFrom(new InternetAddress(config.getEmisorMail()));
		    mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(message.getReceivers().iterator().next())); 
		    mimeMessage.setSubject(message.getSubject());
		    mimeMessage.setContent(mailContend, "text/html; charset=utf-8");
		    
	        Transport transport = session.getTransport("smtp");
	        transport.connect(config.getSmtpmail(), config.getEmisorMail(), config.getPass());
	        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
	        transport.close();
		}catch (Exception e) {
			throw new NotificationException();
		}
	}
}
