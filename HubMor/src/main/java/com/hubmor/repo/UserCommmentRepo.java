package com.hubmor.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hubmor.model.UsersComment;

public interface UserCommmentRepo extends JpaRepository<UsersComment, Long>{

}
