package com.hubmor.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hubmor.DTO.UsersCommentDTO;
import com.hubmor.DTO.UsersDTO;
import com.hubmor.DTO.UsersLikeDTO;
import com.hubmor.model.UsersComment;
import com.hubmor.model.UsersLike;
import com.hubmor.repo.UserCommmentRepo;
import com.hubmor.repo.UsersLikeRepo;


@Service
@Transactional
public class CommentLikeService {
	
	@Autowired
	private UsersLikeRepo usersLikeRepo;
	
	@Autowired
	private UserCommmentRepo userCommmentRepo;

	/*used for save UserLike . it called from HubmorController*/
	public void saveLike(UsersLike usersLikeDTO) {
		UsersLike usersLike=new UsersLike();
		BeanUtils.copyProperties(usersLikeDTO, usersLike);
		usersLikeRepo.save(usersLike);
		
	}

	/*used for save UserComment.it called from HubmorController of saveComment*/
	public void saveComment(UsersCommentDTO commentDTO) {
		UsersComment usercommment=new UsersComment();
		BeanUtils.copyProperties(commentDTO, usercommment);
		userCommmentRepo.save(usercommment);
		
	}

	public List<UsersLikeDTO> findAllLike() {
		List<UsersLikeDTO> dtolist=new ArrayList<>();
		List<UsersLike> list=new ArrayList<>();
		list=usersLikeRepo.findAll();
		for(UsersLike l:list){
			System.out.println("service like is working..."+l.getUserlike());
			UsersLikeDTO dto=new UsersLikeDTO();
			BeanUtils.copyProperties(l, dto);
			dtolist.add(dto);
		}
		return dtolist;
	}

	public int showLikes(){
	List<UsersLike> userLikes=usersLikeRepo.findAll();
	return userLikes.size();
	}

	

}
