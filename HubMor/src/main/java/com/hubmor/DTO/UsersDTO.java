package com.hubmor.DTO;

import java.io.Serializable;

import com.hubmor.model.UserBasicInfo;

public class UsersDTO implements Serializable{
	private String userName;

	private String password;

	private boolean enabled;

	private UserBasicInfo userBasicInfo;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public UserBasicInfo getUserBasicInfo() {
		return userBasicInfo;
	}

	public void setUserBasicInfo(UserBasicInfo userBasicInfo) {
		this.userBasicInfo = userBasicInfo;
	}
	
	
}
