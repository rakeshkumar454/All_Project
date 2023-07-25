package com.globallogic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.entity.Address;
import com.globallogic.entity.User;
import com.globallogic.service.IAddressService;
import com.globallogic.service.IUserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	IUserService userService;
	@Autowired
	IAddressService addressService;
	
	@PostMapping("/save")
	public User addUser(@RequestBody User user) {
		
		return userService.addUser(user);
	}
//	@PostMapping("/save1")
//	public Address addUserAddress( @RequestBody  Address address) {
//	
//		return addressService.addUserAddress(address);	
//	}
	@GetMapping("/get")
	public List<Address> getAllUserAddress(){
		return addressService.getAllUserAddress();
	}
	@GetMapping("/getUser")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}
