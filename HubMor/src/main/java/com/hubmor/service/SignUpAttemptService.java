package com.hubmor.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hubmor.DTO.SignUpAttemptDTO;
import com.hubmor.model.SignUpAttempt;
import com.hubmor.repo.SignupAttemptRepo;



@Service
@Transactional
public class SignUpAttemptService {

	@Autowired
private SignupAttemptRepo signupAttemptRepo;
	
	
	 /*delete Extra object by given user email,it called from loginController */
	public void deleteExtraObject(String userName) {
		signupAttemptRepo.deleteByEmail(userName); 
	}

	public void createSignUpAttempt(SignUpAttemptDTO signUpAttemptDTO) {
		SignUpAttempt signUpAttempt=new SignUpAttempt();
		BeanUtils.copyProperties(signUpAttemptDTO,signUpAttempt);
		signupAttemptRepo.save(signUpAttempt);		
	}
}
