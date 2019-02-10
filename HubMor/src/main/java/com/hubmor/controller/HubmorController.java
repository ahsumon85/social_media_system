package com.hubmor.controller;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hubmor.DTO.UserBasicInfoDTO;
import com.hubmor.DTO.UserTimelineDTO;
import com.hubmor.DTO.UsersCommentDTO;
import com.hubmor.DTO.UsersDTO;
import com.hubmor.DTO.UsersLikeDTO;
import com.hubmor.model.UserBasicInfo;
import com.hubmor.model.UserTimeline;
import com.hubmor.model.UsersLike;
import com.hubmor.service.ActiveService;
import com.hubmor.service.CommentLikeService;
import com.hubmor.service.TimelineService;

@Controller
@ManagedBean
@Scope("session")
public class HubmorController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private UserBasicInfoDTO userBasicInfoDTO;
	private UserTimelineDTO userTimelineDTO;
	private UsersCommentDTO commentDTO;
	private UsersDTO usersActiveDTO;
	private UsersLike usersLikeDTO;
	private List<UserTimelineDTO> userTimeList;
	private List<UsersCommentDTO> userCommentList;
	private List<UsersLikeDTO> usersLikeList;
	private List<UsersDTO> userActiveList;
	private String comment;
	private int like=1;
	private int numberOfLiks;
	
	
	@Autowired
	private TimelineService timelineService;
	
	@Autowired
	private ActiveService activeService;
	
	@Autowired
	private CommentLikeService commentLikeService;
	
	

	 /*used for find all Active from userBasicInformation table.it timeline page active_bar is shown*/
	public void findAllActives(){
		userActiveList=new ArrayList<>();
		userActiveList=activeService.findAllActives();
		
	}
	
	/*used for show all Active from UserLike table.it timeline page active_bar is shown*/
	public void findAllLikes(){
		usersLikeList=new ArrayList<>();
		usersLikeList=commentLikeService.findAllLike();
	
	}
	
	/*that is used for save UserLike in UserLike table. it save from timeline page status_bar*/
	public void saveLike(){
		usersLikeDTO=new UsersLike();
		UserTimeline timeline=new UserTimeline();
		timeline=timelineService.findById(userTimelineDTO.getTimelineID()); /*find user TimelineID from userTimeline table*/
		usersLikeDTO.setUserTimeline(timeline);
		usersLikeDTO.setUserlike(like);
		commentLikeService.saveLike(usersLikeDTO);
		numberOfLiks=0;
		numberOfLiks=commentLikeService.showLikes();
	}
	
	
	/*that is used for save UserComment in UserComment table. it save from timeline page status_bar*/
	public void saveComment(){
		UserTimeline timeline=new UserTimeline();
		timeline=timelineService.findById(userTimelineDTO.getTimelineID()); /*find user TimelineID from userTimeline table*/
		commentDTO.setUserTimeline(timeline);
		commentDTO.setDate(new Date());
		commentLikeService.saveComment(commentDTO);
		
		System.out.println("timeline is working.."+userTimelineDTO.getTimelineID());
		System.out.println("comment is working..."+commentDTO.getUserCom());
		userTimelineDTO=null;
		commentDTO=null;
	}
	
	 /*used for delete Status from UserTimeline table.it timeline page active_bar is called*/
	public void deleteStatus(){
		System.out.println(userTimelineDTO.getTimelineID());
		timelineService.deleteStatus(userTimelineDTO.getTimelineID());
	}


	public UserBasicInfoDTO getUserBasicInfoDTO() {
		if(userBasicInfoDTO==null) userBasicInfoDTO=new UserBasicInfoDTO();
		return userBasicInfoDTO;
	}


	public void setUserBasicInfoDTO(UserBasicInfoDTO userBasicInfoDTO) {
		this.userBasicInfoDTO = userBasicInfoDTO;
	}



	public List<UsersDTO> getUserActiveList() {
		findAllActives();
		return userActiveList;
	}

	public void setUserActiveList(List<UsersDTO> userActiveList) {
		this.userActiveList = userActiveList;
	}

	public UserTimelineDTO getUserTimelineDTO() {
		if(userTimelineDTO==null) userTimelineDTO=new UserTimelineDTO();
		return userTimelineDTO;
	}

	public void setUserTimelineDTO(UserTimelineDTO userTimelineDTO) {
		this.userTimelineDTO = userTimelineDTO;
	}

	public UsersCommentDTO getCommentDTO() {
		if(commentDTO==null) commentDTO=new UsersCommentDTO();
		return commentDTO;
	}

	public void setCommentDTO(UsersCommentDTO commentDTO) {
		this.commentDTO = commentDTO;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public UsersLike getUsersLikeDTO() {
		if(usersLikeDTO==null) usersLikeDTO=new UsersLike();
		return usersLikeDTO;
	}

	public void setUsersLikeDTO(UsersLike usersLikeDTO) {
		this.usersLikeDTO = usersLikeDTO;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public List<UsersCommentDTO> getUserCommentList() {
		return userCommentList;
	}

	public void setUserCommentList(List<UsersCommentDTO> userCommentList) {
		this.userCommentList = userCommentList;
	}

	public List<UsersLikeDTO> getUsersLikeList() {
		findAllLikes();
		return usersLikeList;
	}

	public void setUsersLikeList(List<UsersLikeDTO> usersLikeList) {
		this.usersLikeList = usersLikeList;
	}

	public UsersDTO getUsersActiveDTO() {
		if(usersActiveDTO==null) usersActiveDTO=new UsersDTO();
		return usersActiveDTO;
	}

	public void setUsersActiveDTO(UsersDTO usersActiveDTO) {
		this.usersActiveDTO = usersActiveDTO;
	}

	public int getNumberOfLiks() {
		return numberOfLiks;
	}

	public void setNumberOfLiks(int numberOfLiks) {
		this.numberOfLiks = numberOfLiks;
	}
	
	
	

}
