package com.hubmor.DTO;

import java.io.Serializable;
import java.util.Date;


public class SignUpAttemptDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long signUpAttemptID;

	private String email;

	private int status;

	private Date date;

	private String activationCode;

	public Long getSignUpAttemptID() {
		return signUpAttemptID;
	}

	public void setSignUpAttemptID(Long signUpAttemptID) {
		this.signUpAttemptID = signUpAttemptID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	
}
