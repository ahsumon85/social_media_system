package com.hubmor.service;



import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hubmor.DTO.UserBasicInfoDTO;
import com.hubmor.model.UserBasicInfo;
import com.hubmor.repo.UserBasicInfoRepo;




@Service
@Transactional
public class UserBasicInfoService {

	@Autowired
private UserBasicInfoRepo userBasicInfoRepo;
	
	/* save user basic infromation in userBasicInfo table, it clled from LoginController*/
	public void saveUserBasicInfo(UserBasicInfoDTO userBasicInfoDTO){
		UserBasicInfo userBasicInfo=new UserBasicInfo();
		BeanUtils.copyProperties(userBasicInfoDTO, userBasicInfo); 
		userBasicInfoRepo.save(userBasicInfo);
	}

	/*find user userBasicInfo ID from UserBasicInfo table,it clled from LoginController*/
	public UserBasicInfo findByEmail(String email) {
		UserBasicInfo userBasicInfo=new UserBasicInfo();
		userBasicInfo=userBasicInfoRepo.findByEmail(email);
		return userBasicInfo;
	}

	/*that is used for find userID/personalID from UserBasicInfo table, find by user email. 
	 * it called from login Controller*/
	public UserBasicInfo findById(String email) {
		UserBasicInfo userBasicInfo=new UserBasicInfo();
		userBasicInfo=userBasicInfoRepo.findByEmail(email);
		return userBasicInfo;
	}

	
}
