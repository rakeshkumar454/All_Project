package com.globallogic.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globallogic.dto.AddressDto;
import com.globallogic.dto.UserDto;
import com.globallogic.entity.Address;
import com.globallogic.entity.User;
import com.globallogic.repository.UserRepository;
import com.globallogic.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDto> getAllUsers() {

		List<User> users = userRepository.findAll();
		return users.stream().map(user -> convertToDto(user)).collect(Collectors.toList());
	}

	@Override
	public UserDto addUser(UserDto userDto) {

		User user = converToEntity(userDto);
		return convertToDto(userRepository.save(user));
	}

	@Override
	public UserDto getUserById(long id) {

		return convertToDto(userRepository.findById(id).get());
	}

	@Override
	public UserDto updateUserById(long id, UserDto userDto) {

		User user = userRepository.findById(id).get();

		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());

		Address address = new Address();

		address.setId(userDto.getAddressDto().getId());
		address.setStreet(userDto.getAddressDto().getStreet());
		address.setCity(userDto.getAddressDto().getCity());
		address.setZipCode(userDto.getAddressDto().getZipCode());
		address.setState(userDto.getAddressDto().getState());
		address.setCountry(userDto.getAddressDto().getCountry());

		user.setAddress(address);

		return convertToDto(userRepository.save(user));
	}

	@Override
	public void deleteUserById(long id) {

		userRepository.delete(userRepository.findById(id).get());

	}

	/*
	 * It Converts User Entity to User DTO
	 */
	private UserDto convertToDto(User user) {

		AddressDto addressDto = new AddressDto();

		addressDto.setId(user.getAddress().getId());
		addressDto.setStreet(user.getAddress().getStreet());
		addressDto.setCity(user.getAddress().getCity());
		addressDto.setZipCode(user.getAddress().getZipCode());
		addressDto.setState(user.getAddress().getState());
		addressDto.setCountry(user.getAddress().getCountry());

		UserDto userDto = new UserDto();

		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		userDto.setAddressDto(addressDto);

		return userDto;
	}

	/*
	 * It Converts User DTO to User Entity
	 */
	private User converToEntity(UserDto userDto) {

		Address address = new Address();
		User user = new User();

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
