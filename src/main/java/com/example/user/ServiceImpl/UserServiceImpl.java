package com.example.user.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.Entity.UserEntity;
import com.example.user.Repository.UserRepo;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;
	
	public UserEntity saveuserDetails(UserEntity userEntity) {
		 return userRepo.save(userEntity);
		
	}
public List<UserEntity> saveusers(List<UserEntity> userEntity)
{
	
	  List<UserEntity> userentity=userRepo.saveAll(userEntity);
	  return userentity;
}

public UserEntity getuserdetails(Long id) {
	return userRepo.findById(id).get();
	
}
@Override
public List<UserEntity> getalluser() {
	
	return userRepo.findAll();
}

@Override
public UserEntity updateuseDetails(UserEntity entity) {
	
	return userRepo.save(entity);
}
@Override
public List<UserEntity> updatelistusers(List<UserEntity> entity) {

	return userRepo.saveAll(entity);
}


}
