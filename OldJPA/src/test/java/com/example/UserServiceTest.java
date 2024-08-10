package com.example;

import org.junit.jupiter.api.Test;


import com.example.model.AppUser;
import com.example.repository.UserRepository;
import com.example.service.UserService;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    @Test
    public void testCreateAndGetUser() {
		
		  UserRepository userRepository = new UserRepository(); UserService userService
		  = new UserService(userRepository);
		  
		  userService.createUser("John Doe", "john.doe@example.com"); 
		  AppUser user =
		  userService.getUser(1);
		  
		  assertNotNull(user); assertEquals("John Doe", user.getName());
		  assertEquals("john.doe@example.com", user.getEmail());
		  
		  userService.printAllUsers();
		 
    }
}
