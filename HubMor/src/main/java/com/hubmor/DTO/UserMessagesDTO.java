package com.hubmor.DTO;

import java.io.Serializable;
import java.util.Date;

import com.hubmor.model.Users;

public class UserMessagesDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private long masseagesID;
	private Date time;
	private String masseages;
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
