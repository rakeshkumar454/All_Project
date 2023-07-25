package com.globallogic.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.dto.AddressDto;
import com.globallogic.dto.UserDto;
import com.globallogic.entity.Address;
import com.globallogic.entity.User;
import com.globallogic.repository.IUserRepository;
import com.globallogic.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private IUserRepository userRepo;

	@Override
	public List<UserDto> getAllUser() {
		List<User> users=userRepo.findAll();
		List<UserDto> userDtos=new ArrayList<>();
		
		for(User user: users) {
			userDtos.add(convertToDto(user));
		}
		return userDtos;
	}

	@Override
	public UserDto addUser(UserDto userDto) {
	
		User user = convertToEntity(userDto);
		User user1 = userRepo.save(user);
		
		return convertToDto(user1);
	}

	@Override
	public UserDto getUserById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDto updateUserById(long id, UserDto userDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub

	}
	/*
	 * Method for convert entity to dto
	 */

	private UserDto convertToDto(User user) {
		UserDto userDto = new UserDto();

		AddressDto addressDto = new AddressDto();
		addressDto.setId(user.getAddress().getId());
		addressDto.setState(user.getAddress().getStreet());
		addressDto.setCity(user.getAddress().getCity());
		addressDto.setZipCode(user.getAddress().getZipCode());
		addressDto.setState(user.getAddress().getState());
		addressDto.setCountry(user.getAddress().getCountry());

		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAddressDto(addressDto);
		return userDto;
	}

	/*
	 * convert dto to entity
	 */
	private User convertToEntity(UserDto userDto) {
		User user = new User();
		Address address = new Address();

		address.setId(userDto.getAddressDto().getId());
		address.setStreet(userDto.getAddressDto().getStreet());
		address.setCity(userDto.getAddressDto().getCity());
		address.setZipCode(userDto.getAddressDto().getZipCode());
		address.setState(userDto.getAddressDto().getState());
		address.setCountry(userDto.getAddressDto().getCountry());

		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAddress(address);
		address.setUser(user);

		return user;
	}
}
