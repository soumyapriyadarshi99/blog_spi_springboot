package com.soumya.blogging.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.soumya.blogging.entities.User;
import com.soumya.blogging.payloads.UserDto;
import com.soumya.blogging.repositories.UserRepo;
import com.soumya.blogging.services.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user=this.dtoToUser(userDto);
		User savedUser=this.userRepo.save(user);
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser(UserDto user, int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}
	
	public User dtoToUser(UserDto userDto) {
		User user = new User();
		user.setId(userDto.getId());
		user.setEmail(userDto.getEmail());
		user.setName(userDto.getName());
		user.setAbout(userDto.getAbout());
		user.setPassword(userDto.getPassword());
		return user; 
	}
	
	public UserDto userToDto(User user) {
		UserDto userDto=new UserDto();
		userDto.setName(user.getName());
		userDto.setId(user.getId());
		userDto.setAbout(user.getAbout());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		return userDto;
	}

}










