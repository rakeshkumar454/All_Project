package com.globallogic.service.impl;

import com.globallogic.exception.ResourceNotFoundException;
import com.globallogic.model.User;
import com.globallogic.payloads.UserDto;
import com.globallogic.repositories.UserRepo;
import com.globallogic.service.UserService;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.dtoToEntity(userDto);
        User createUser = this.userRepo.save(user);
        return this.userToDto(createUser);
    }
    @Override
    public UserDto updateUser(UserDto userDto, Integer userId) {
        User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "userId", userId));
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAbout(userDto.getAbout());

        User updatedUser = this.userRepo.save(user);
        UserDto userDto1 =this.userToDto(updatedUser);
        return userDto1;
    }

    @Override
    public UserDto getUserById(Integer userId) {
       User user = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "userId", userId));
       return this.userToDto(user);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> users= this.userRepo.findAll();
        List<UserDto> userDtos = users.stream().map(user-> this.userToDto(user)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public void deleteById(Integer userId) {
        User user = this.userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "UserId", userId));
        this.userRepo.delete(user);
    }
    public User dtoToEntity(UserDto userDto){
//        User user =new User();
//        user.setUserId(userDto.getUserId());
//        user.setName(userDto.getName());
//        user.setEmail(userDto.getEmail());
//        user.setPassword(userDto.getPassword());
//        user.setAbout(userDto.getAbout());

        User user = this.modelMapper.map(userDto, User.class);
        return user;
    }
    public UserDto userToDto(User user){
//        UserDto userDto= new UserDto();
//        userDto.setUserId(user.getUserId());
//        userDto.setName(user.getName());
//        userDto.setEmail(user.getEmail());
//        userDto.setPassword(user.getPassword());
//        userDto.setAbout(user.getAbout());
        UserDto userDto = this.modelMapper.map(user, UserDto.class);
        return userDto;
    }

}
