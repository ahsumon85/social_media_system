package com.hubmor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.hubmor.model.Users;


public interface UsersRepo extends JpaRepository<Users, Long>{
	public Users findByUserName(String userName);

	
}
