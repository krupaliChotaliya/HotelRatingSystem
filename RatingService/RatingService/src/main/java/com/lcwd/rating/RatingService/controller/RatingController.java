package com.lcwd.rating.RatingService.controller;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;
    @PostMapping
    public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
        System.out.println(rating);
        ResponseEntity<Rating> rs = null;
        try {
            rs = new ResponseEntity<Rating>(ratingService.saveRating(rating), HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
        return new ResponseEntity<List<Rating>>(ratingService.findRatingByHotelId(hotelId),HttpStatus.OK);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
        return new ResponseEntity<List<Rating>>(ratingService.findRatingByUserId(userId),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRating(){
        return new ResponseEntity<List<Rating>>(ratingService.getRating(),HttpStatus.OK);
    }
}

