package com.stylesync.user.controller;

import com.stylesync.user.model.User;
import com.stylesync.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User save(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{username}")
    public User getByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }
}