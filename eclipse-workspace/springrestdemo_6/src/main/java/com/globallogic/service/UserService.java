package com.globallogic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.entity.Address;
import com.globallogic.entity.User;
import com.globallogic.repository.AddressRepository;
import com.globallogic.repository.UserRepository;
@Service
public class UserService implements IUserService{

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	AddressRepository addressRepo;
	
//	@Override
//	public Address addUserAddress(Address address) {
//		
//		return addressRepo.save(address);
//	}
//
//	@Override
//	public List<Address> getAllUserAddress() {
//		
//		return addressRepo.findAll();
//	}
//
//	@Override
//	public void deleteAddressById(long id) {
//		addressRepo.deleteById(id);
//		
//	}
//
//	@Override
//	public Address updateAddressById(Address address, long id) {
//		
//		return null;
//	}

	@Override
	public User addUser(User user) {
		Address address= new Address();
		addressRepo.save(address);
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public void deleteByUserId(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User updateUserById(User user, long id) {
		// TODO Auto-generated method stub
		return null;
	}


}
