package com.example.user.ServiceImpl;

import java.util.List;

import com.example.user.Entity.UserEntity;
public interface UserService {

	UserEntity saveuserDetails(UserEntity user);
	List<UserEntity> saveusers(List<UserEntity> userEntity);
	UserEntity getuserdetails(Long id);
	List<UserEntity> getalluser();
	
	UserEntity updateuseDetails(UserEntity entity);
	List<UserEntity> updatelistusers(List<UserEntity> entity);


}
