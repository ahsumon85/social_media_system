package com.hubmor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hubmor.DTO.UserTimelineDTO;
import com.hubmor.model.UserBasicInfo;
import com.hubmor.model.UserTimeline;
import com.hubmor.model.Users;
import com.hubmor.repo.TimelineRepo;
import com.hubmor.repo.UserBasicInfoRepo;

@Service
@Transactional
public class TimelineService {
	
	@Autowired
	private TimelineRepo timelineRepo;
	@Autowired
	private UserBasicInfoRepo userBasicInfoRepo;

	
	/*that is used for save user status in UserTimeline table. it called from Login Controller*/
	public void statusSave(UserTimelineDTO userTimelineDTO) {
		UserTimeline userTimeline=new UserTimeline();
		BeanUtils.copyProperties(userTimelineDTO, userTimeline);
		timelineRepo.save(userTimeline);
		
	}

	/*that is used for show all individual user status from UserTimeline table, find by user email.
	 *  it profile page is shown, it method called from Login Controller*/
	public List<UserTimelineDTO> findByStatus(String userName) {
		List<UserTimelineDTO> dtolist=new ArrayList<>();
		List<UserTimeline> list=new ArrayList<>();
		list=timelineRepo.findByStatus(userName);
		for(UserTimeline t:list){
			UserTimelineDTO dto=new UserTimelineDTO();
			BeanUtils.copyProperties(t, dto);
			dtolist.add(dto);
		}
		return dtolist;
	}

	/*find All user status from UserTimeline table, it method called from loginController*/
	public List<UserTimelineDTO> findAllTimeline() {
		List<UserTimelineDTO> dtolist=new ArrayList<>();
		List<UserTimeline> list=new ArrayList<>();
		list=timelineRepo.findAll();
		for(UserTimeline t:list){
			UserTimelineDTO dto=new UserTimelineDTO();
			BeanUtils.copyProperties(t, dto);
			dtolist.add(dto);
		}
		return dtolist;
	}

	/*used for delete Status from UserTimeline table.it called from HubmorController*/
	public void deleteStatus(Long timelineID) {
		timelineRepo.delete(timelineID);
		
	}

	/*find user TimelineID ,it method called from HubmorController*/
	public UserTimeline findById(Long timelineID) {
		UserTimeline timeline=new UserTimeline();
		timeline=timelineRepo.findOne(timelineID);
		return timeline;
	}

	/*find User Experts from UserBasicInfo table,it method called from login controller*/
	public UserBasicInfo findByUserExperts(String userName) {
		UserBasicInfo user=new UserBasicInfo();
		user=userBasicInfoRepo.findByEmail(userName);
		return user;
	}

	/*find User Experts wise status from UserTimeline table,it method called from login controller*/
	public List<UserTimelineDTO> findExpertsByStatus(String experts) {
		List<UserTimelineDTO> dtolist=new ArrayList<>();
		List<UserTimeline> list=new ArrayList<>();
		list=timelineRepo.findExpertsByStatus(experts);
		for(UserTimeline t:list){
			UserTimelineDTO dto=new UserTimelineDTO();
			BeanUtils.copyProperties(t, dto);
			dtolist.add(dto);
		}
		return dtolist;
	}


	

}
