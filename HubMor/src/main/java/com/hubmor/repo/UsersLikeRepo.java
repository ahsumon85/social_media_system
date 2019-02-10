package com.hubmor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hubmor.model.UsersLike;

public interface UsersLikeRepo extends JpaRepository<UsersLike, Long>{
	
/*
	@Query(value="select t from UsersLike t where t.userTimeline.timelineID=?1")
	List<UsersLike> findIdWiseLike(Long timelineID);
*/
}
