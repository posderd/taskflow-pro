package com.taskflo.taskflo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.taskflo.taskflo.entity.User;
import com.taskflo.taskflo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}