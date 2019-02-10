
package com.hubmor.signup;

import java.io.Serializable;

import org.springframework.stereotype.Component;
@Component
public class EmailSendingHelper implements Serializable {

	private static final long serialVersionUID = 1L;

	private EmailSending emailSending;

	public EmailSendingService serviceDao = new EmailSendingServiceImpl();

	public void sendMail() {

		String host = "smtp.gmail.com";
		String port = "587";
		final String user = "habibsumoncse2@gmail.com";
		final String pass = "habibsumond1u";

		if (serviceDao.sendEmail(emailSending, host, port, user, pass)) {

			System.out.println("Email has been sent");

			this.emailSending = null;
		}

		else {

		}
	}

	public EmailSending getEmailSending() {
		if (this.emailSending == null) {
			this.emailSending = new EmailSending();
		}
		return emailSending;
	}

	public void setEmailSending(EmailSending emailSending) {
		this.emailSending = emailSending;
	}

}
