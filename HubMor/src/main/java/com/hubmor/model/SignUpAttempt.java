package com.hubmor.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sign_up_attempt")
public class SignUpAttempt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long signUpAttemptID;

	@Column(name = "email")
	private String email;

	@Column(name = "status")
	private int status;

	@Column(name = "date")
	private Date date;

	@Column(name = "activation_code")
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
