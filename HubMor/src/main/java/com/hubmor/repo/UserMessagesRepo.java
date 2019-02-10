package com.hubmor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hubmor.model.UserMessages;

public interface UserMessagesRepo extends JpaRepository<UserMessages, Long>{

}
