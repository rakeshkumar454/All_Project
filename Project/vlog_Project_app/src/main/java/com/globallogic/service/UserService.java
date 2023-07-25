package com.globallogic.service;

import com.globallogic.model.User;
import com.globallogic.payloads.UserDto;

import java.util.List;

public interface UserService {
   UserDto createUser(UserDto userDto);
   UserDto updateUser(UserDto userDto, Integer userId);
   UserDto getUserById(Integer userId);
   List<UserDto>getAllUser();
   void deleteById(Integer userId);
}
