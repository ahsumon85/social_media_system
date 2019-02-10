package com.hubmor.DTO;

import java.io.Serializable;

import com.hubmor.model.UserTimeline;

public class UsersLikeDTO implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private Long likeID;
	private int userlike;
	private int totalLike;
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
	public int getTotalLike() {
		return totalLike;
	}
	public void setTotalLike(int totalLike) {
		this.totalLike = totalLike;
	}
	
	

}
