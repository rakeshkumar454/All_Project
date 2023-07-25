package com.globallogic.service;

import java.util.List;

import com.globallogic.dto.UserDto;

public interface UserService {

	List<UserDto> getAllUser();

	UserDto addUser(UserDto userDto);

	UserDto getUserById(long id);

	UserDto updateUserById(long id, UserDto userDto);

	void deleteById(long id);
}
