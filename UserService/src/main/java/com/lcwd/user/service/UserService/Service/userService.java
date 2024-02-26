package com.lcwd.user.service.UserService.Service;

import com.lcwd.user.service.UserService.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface userService {

    User saveUser(User user);

    List<User> getAllUser();

    User getUser(String uid);

}
