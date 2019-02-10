package com.hubmor.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="message")
public class UserMessages implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long masseagesID;
	
	@Column(name="time")
	private Date time;
	
	@Column(name="masseages")
	private String masseages;
	
	@ManyToOne
	@JoinColumn(name="userName")
	private Users users;

	public long getMasseagesID() {
		return masseagesID;
	}

	public void setMasseagesID(long masseagesID) {
		this.masseagesID = masseagesID;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getMasseages() {
		return masseages;
	}

	public void setMasseages(String masseages) {
		this.masseages = masseages;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	
}
