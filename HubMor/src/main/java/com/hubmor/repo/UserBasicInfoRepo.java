package com.hubmor.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hubmor.model.UserBasicInfo;
import com.hubmor.model.Users;


public interface UserBasicInfoRepo extends JpaRepository<UserBasicInfo, Long>{

	/*that is used for find userID/personalID, find by user email.it called from UserBasicInfoService*/
	/*find User Experts,it method called from timelineService*/
	/*find user userBasicInfo ID,it called from UserBasicInfoService*/
	UserBasicInfo findByEmail(String email);

	void deleteByEmail(String email);

	/*that is used for show user all information by user email from userBasicInformation table.
	 * it called from UserBasicInfoService*/
	@Query(value="select t from UserBasicInfo t where t.email=?1")
	List<UserBasicInfo> findByUser(String email);

	/*@Query(value="select t from UserBasicInfo t where t.email=?1")
	UserBasicInfo findByUserExperts(String userName);
*/
	
	
	
}
