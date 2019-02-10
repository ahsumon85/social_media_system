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
@Table(name="timeline")
public class UserTimeline implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="timelineID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long timelineID;
	
	@Column(name="type")
	private String type;
	
	@Column(name="status")
	private String status;
	
	@Column(name="photoPath")
	private String photoPath;
	
	@Column(name="date")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="personalId")
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
