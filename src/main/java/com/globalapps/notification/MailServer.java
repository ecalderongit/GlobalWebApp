package com.globalapps.notification;

public class MailServer {
	
	public MailServer() {
		super();
	}
	private String emisorMail, pass, port, smtpmail;


	public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
		public String getEmisorMail() {
			return emisorMail;
		}
		public void setEmisorMail(String emisorMail) {
			this.emisorMail = emisorMail;
		}
		public String getPort() {
			return port;
		}
		public void setPort(String port) {
			this.port = port;
		}
		public String getSmtpmail() {
			return smtpmail;
		}
		public void setSmtpmail(String smtpmail) {
			this.smtpmail = smtpmail;
		}
		
}
