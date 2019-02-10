package com.hubmor.signup;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class EmailSendingServiceImpl implements EmailSendingService {

	public boolean sendEmail(EmailSending emailSending, String host, String port, final String user,
			final String pass) {

		String toAddress = emailSending.getReceipient();

		String subject = emailSending.getSubject();

		String message = emailSending.getContent();

		// sets SMTP server properties
		Properties properties = new Properties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", port);
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		// creates a new session with an authenticator
		Authenticator auth = new Authenticator() {
			@Override
			public PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, pass);
			}
		};

		Session session = Session.getInstance(properties, auth);

		// creates a new e-mail message
		Message msg = new MimeMessage(session);

		try {
			msg.setFrom(new InternetAddress(user));

			InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
			msg.setRecipients(Message.RecipientType.TO, toAddresses);
			msg.setSubject(subject);
			msg.setSentDate(new Date());
			msg.setText(message);
			Transport.send(msg);

			return true;

		}

		catch (AddressException ae) {
			ae.printStackTrace();
			return false;
		}

		catch (MessagingException me) {
			me.printStackTrace();

			return false;
		}

	}

}
