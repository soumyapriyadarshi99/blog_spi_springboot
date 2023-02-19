package com.soumya.blogging.services;

import java.util.List;

import com.soumya.blogging.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,int userId);
	
	UserDto getUserById(int userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(int userId);

}
