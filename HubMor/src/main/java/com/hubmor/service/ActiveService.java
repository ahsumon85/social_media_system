package com.hubmor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hubmor.DTO.UsersDTO;
import com.hubmor.model.Users;
import com.hubmor.repo.UsersRepo;

@Service
@Transactional
public class ActiveService {
	
	@Autowired
	private UsersRepo usersRepo;

	
	 /*used for find all Active.it timeline page active_bar is shown, it called from HubmorController*/
	public List<UsersDTO> findAllActives() {
		 List<UsersDTO> dtolist=new ArrayList<>();
		 List<Users> list=new ArrayList<>();
		 list=usersRepo.findAll();
		 for(Users u:list){
			 UsersDTO dto=new UsersDTO();
			 BeanUtils.copyProperties(u, dto);
			 dtolist.add(dto);
		 }
		return dtolist;
	}

}
