package com.globallogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globallogic.entity.Address;
import com.globallogic.entity.User;
import com.globallogic.repository.AddressRepository;
import com.globallogic.repository.UserRepository;

@SpringBootApplication
public class Springrestdemo6Application {

	@Autowired
	UserRepository userRepository;
//	@Autowired
//	AddressRepository addressRepository;
//	
	public static void main(String[] args) {
		SpringApplication.run(Springrestdemo6Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		
////		 create a user instance
//		User user = new User("John Doe", "john.doe@example.com", "1234abcd");
//
//		// create an address instance
//		Address address = new Address("Lake View 321", "Berlin", "Berlin", "95781", "DE");
//
//		// set child reference
//		address.setUser(user);
//
//		// set parent reference
//		user.setAddress(address);
//
//		// save the parent
//		// which will save the child (address) as well
//		userRepository.save(user);
	

//
}
