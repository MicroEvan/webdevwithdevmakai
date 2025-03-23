package com.example.crudapi.service;

import com.example.crudapi.entity.User;
import com.example.crudapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    // Create or update a user
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    // Get a user by ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    // Delete a user by ID
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
