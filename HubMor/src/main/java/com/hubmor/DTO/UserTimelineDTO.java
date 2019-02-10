package com.hubmor.DTO;

import java.io.Serializable;
import java.util.Date;

import com.hubmor.model.UserBasicInfo;

public class UserTimelineDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long timelineID;
	private String type;
	private String status;
	private String photoPath;
	private Date date;
	private UserBasicInfo userBasicInfo;
	
	
	
	public Long getTimelineID() {
		return timelineID;
	}
	public void setTimelineID(Long timelineID) {
		this.timelineID = timelineID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public UserBasicInfo getUserBasicInfo() {
		if(userBasicInfo==null) userBasicInfo=new UserBasicInfo();
		return userBasicInfo;
	}
	public void setUserBasicInfo(UserBasicInfo userBasicInfo) {
		this.userBasicInfo = userBasicInfo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
