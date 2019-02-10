package com.hubmor.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hubmor.model.SignUpAttempt;

;


public interface SignupAttemptRepo extends JpaRepository<SignUpAttempt, Long>{
	
	 /*delete Extra object by given user email, it called from deleteByEmail */
	@Modifying
	@Query(value="delete from SignUpAttempt t where t.email=?1")
	public void deleteByEmail(String name);	
}
