package com.example.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.Entity.UserEntity;
import com.example.user.ServiceImpl.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/save")
	public UserEntity saveuser(@RequestBody UserEntity user) {

		return userService.saveuserDetails(user);
	}

	@PostMapping("/savemultipleuser")
	public List<UserEntity> savemultipleusers(@RequestBody List<UserEntity> userEntity) {
		List<UserEntity> entity = userService.saveusers(userEntity);
		return entity;
}
	@GetMapping("/get/{id}")
	public UserEntity getusers(@PathVariable Long id) {
	return userService.getuserdetails(id);
		
	}
	@GetMapping("/getall")
	public List<UserEntity> getusers(){
		return userService.getalluser();
		}
	
	@PutMapping("/update")
	public UserEntity updateusers(@RequestBody UserEntity entity) {
		return userService.updateuseDetails(entity);
		}
	

	@PutMapping("/updatedetails")
	public List<UserEntity> updateusers(@RequestBody List<UserEntity> entity) {
		return userService.updatelistusers(entity);
		}
}

