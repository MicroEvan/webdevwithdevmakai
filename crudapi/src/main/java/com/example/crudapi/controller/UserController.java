package com.example.crudapi.controller;

import com.example.crudapi.entity.User;
import com.example.crudapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/users")
@RestController //Solution to the problem we had last time was including @RestController annotation.
                //Also no that it should come after the @RequestMapping.
public class UserController {

    @Autowired
    private UserService userService;
    // Create or update user
    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
    // Get all users
    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    // Get user by ID
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    // Delete user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
