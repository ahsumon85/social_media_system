

package com.hubmor.signup;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class EmailSending implements Serializable {

	private static final long serialVersionUID = 1L;
	private String receipient;
	private String subject;
	private String content;

	public EmailSending() {
	}

	public EmailSending(String receipient, String subject, String content) {
		this.receipient = receipient;
		this.subject = subject;
		this.content = content;
	}

	public String getReceipient() {
		return receipient;
	}

	public void setReceipient(String receipient) {
		this.receipient = receipient;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
