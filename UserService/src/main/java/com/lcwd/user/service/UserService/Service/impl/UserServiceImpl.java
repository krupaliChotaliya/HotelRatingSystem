package com.lcwd.user.service.UserService.Service.impl;

import com.lcwd.user.service.UserService.Service.userService;
import com.lcwd.user.service.UserService.entities.Hotel;
import com.lcwd.user.service.UserService.entities.Rating;
import com.lcwd.user.service.UserService.entities.User;
import com.lcwd.user.service.UserService.exception.ResourceNotFoundException;
import com.lcwd.user.service.UserService.externalService.Hotelservice;
import com.lcwd.user.service.UserService.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements userService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private Hotelservice hotelservice;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

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
        User user = userRepository.findById(uid).orElseThrow(() -> new ResourceNotFoundException("user is not found for this" + uid));
        //API calling  to get rating of user
        Rating[] ratingOfUser = restTemplate.getForObject("http://RATING-SERVICE/rating/users/" + user.getUid(), Rating[].class);
        List<Rating> ratings = Arrays.stream(ratingOfUser).toList();

        List<Rating> ratingList = ratings.stream().map(rating -> {
//            using restTemplate
//            ResponseEntity<Hotel> response = restTemplate.getForEntity("http://HOTEL-SERVICE/hotels/" + rating.getHotelId(), Hotel.class);
//            Hotel hotel = response.getBody();
//            rating.setHotel(hotel);


            //feign client call api of hotelservice
            Hotel hotel=hotelservice.getHotel(rating.getHotelId());
            rating.setHotel(hotel);

            return rating;
        }).collect(Collectors.toList());
        user.setRatings(ratingList);


        return user;
    }
}
