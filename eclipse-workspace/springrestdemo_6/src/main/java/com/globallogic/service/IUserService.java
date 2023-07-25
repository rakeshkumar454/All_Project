package com.globallogic.service;

import java.util.List;

import com.globallogic.entity.User;

public interface IUserService {

	public User addUser(User user);
	public List<User> getAllUser();
	public void deleteByUserId(long id);
	public User updateUserById(User user, long id);
}
