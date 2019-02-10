package com.hubmor.DTO;

import java.io.Serializable;
import java.util.Date;

import com.hubmor.model.UserTimeline;

public class UsersCommentDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Long comID;
	private String userCom;
	private Date date;
	private UserTimeline userTimeline;
	
	
	public Long getComID() {
		return comID;
	}
	public void setComID(Long comID) {
		this.comID = comID;
	}
	public String getUserCom() {
		return userCom;
	}
	public void setUserCom(String userCom) {
		this.userCom = userCom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public UserTimeline getUserTimeline() {
		return userTimeline;
	}
	public void setUserTimeline(UserTimeline userTimeline) {
		this.userTimeline = userTimeline;
	}

}
