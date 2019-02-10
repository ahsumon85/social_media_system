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
@Table(name="comment")
public class UsersComment implements Serializable{

	
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name="comID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long comID;
	
	@Column(name="userCom")
	private String userCom;
	
	@Column(name="date")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="timelineID")
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
