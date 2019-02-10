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
@Table(name = "password_reset_attempt")
public class PasswordResetAttempt implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long passwordResetAttemptID;

	@Column(name = "email")
	private String email;

	@Column(name = "status")
	private int status;

	@Column(name = "reset_code")
	private String resetCode;

	@Column(name = "date")
	private Date date;

	public Long getPasswordResetAttemptID() {
		return passwordResetAttemptID;
	}

	public void setPasswordResetAttemptID(Long passwordResetAttemptID) {
		this.passwordResetAttemptID = passwordResetAttemptID;
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

	public String getResetCode() {
		return resetCode;
	}

	public void setResetCode(String resetCode) {
		this.resetCode = resetCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
