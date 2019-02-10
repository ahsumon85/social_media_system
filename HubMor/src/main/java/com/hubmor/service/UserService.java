package com.hubmor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hubmor.DTO.UserBasicInfoDTO;
import com.hubmor.DTO.UsersDTO;
import com.hubmor.model.UserBasicInfo;
import com.hubmor.model.Users;
import com.hubmor.repo.UserBasicInfoRepo;
import com.hubmor.repo.UsersRepo;





@Service
@Transactional
public class UserService {

	@Autowired
private UsersRepo usersRepo;
	
	@Autowired
	private UserBasicInfoRepo userBasicInfoRepo;
	
	/*public boolean isUserExist(String userName){
		boolean userExistence=false;
		Users user=new Users();
		user=usersRepo.findByUserName(userName);
		if(user!=null){
			userExistence=true;
		}		
		return userExistence;
	}
*/
	
	/* save user id and password  in user table, it called from login Controller*/
	public void saveUser(UsersDTO usersDTO){
		Users user=new Users();
		BeanUtils.copyProperties(usersDTO, user);
		usersRepo.save(user);
		
	}

	/*find user account from user table, for user login, it called form login Controller*/
	public Users findByUserName(String userName) {
		return(Users)usersRepo.findByUserName(userName);
	}

	/*that is used for show user all information by user email from userBasicInformation table.it called from login Controller*/
	public List<UserBasicInfoDTO> findByUser(String email) {
		List <UserBasicInfoDTO> dtoList=new ArrayList<>();
		List<UserBasicInfo> list=new ArrayList<>();
		list=userBasicInfoRepo.findByUser(email);
		for(UserBasicInfo s:list){
			UserBasicInfoDTO dto=new UserBasicInfoDTO();
			BeanUtils.copyProperties(s, dto);
			dtoList.add(dto);
		}
		return dtoList;
	}

	/*that is used for edit user information, it called from login controller*/
	public void editUser(UserBasicInfoDTO userBasicInfoDTO) {
		UserBasicInfo users=new UserBasicInfo();
		BeanUtils.copyProperties(userBasicInfoDTO, users);
		userBasicInfoRepo.save(users);
		
	}
	
	
	
	
}
