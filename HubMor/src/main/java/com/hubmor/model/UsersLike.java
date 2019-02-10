package com.hubmor.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_like")
public class UsersLike implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="likeID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long likeID;
	
	@Column(name="userlike")
	private int userlike;
	
	@ManyToOne
	@JoinColumn(name="timelineID")
	private UserTimeline userTimeline;

	public Long getLikeID() {
		return likeID;
	}


	public void setLikeID(Long likeID) {
		this.likeID = likeID;
	}


	public int getUserlike() {
		return userlike;
	}


	public void setUserlike(int userlike) {
		this.userlike = userlike;
	}


	public UserTimeline getUserTimeline() {
		return userTimeline;
	}


	public void setUserTimeline(UserTimeline userTimeline) {
		this.userTimeline = userTimeline;
	}
	

	
}
