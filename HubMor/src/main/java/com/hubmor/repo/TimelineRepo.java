package com.hubmor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.hubmor.model.UserBasicInfo;
import com.hubmor.model.UserTimeline;
import com.hubmor.model.Users;

public interface TimelineRepo extends JpaRepository<UserTimeline, Long>{
	
	/*that is used for show all individual user status from UserTimeline table, find by user email.
	 *  it profile page is shown, it method called from TimelineService*/
	@Query(value="select t from UserTimeline t where t.userBasicInfo.email=?1")
	List<UserTimeline> findByStatus(String userName);

	
	
	@Modifying
	@Query("delete from UserTimeline t where t.timelineID = ?1")
	void delete(Long timelineID);



	/*find User Experts wise status ,it method called from TimelineService*/
	@Query(value="select t from UserTimeline t where t.type=?1")
	List<UserTimeline> findExpertsByStatus(String experts);


}
