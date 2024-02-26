package com.lcwd.user.service.UserService.Service.impl;

import com.lcwd.user.service.UserService.Service.userService;
import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.exception.ResourceNotFoundException;
import com.lcwd.user.service.UserService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements userService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        user.setUid(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String uid) {
        return userRepository.findById(uid).orElseThrow(()-> new ResourceNotFoundException("user is not found for this"+uid));
    }
}
