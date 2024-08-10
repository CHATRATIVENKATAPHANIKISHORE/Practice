package com.example.service;

import com.example.model.AppUser;
import com.example.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String name, String email) {
        AppUser user = new AppUser(name, email);
        userRepository.save(user);
    }

    public AppUser getUser(int id) {
        return userRepository.findById(id);
    }

    public void printAllUsers() {
        for (AppUser user : userRepository.findAll()) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }
}
