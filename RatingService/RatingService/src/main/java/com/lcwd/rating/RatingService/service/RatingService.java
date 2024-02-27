package com.lcwd.rating.RatingService.service;

import com.lcwd.rating.RatingService.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    public Rating saveRating(Rating rating);
    public List<Rating> getRating();
    public List<Rating> findRatingByHotelId(String hotelId);
    public List<Rating> findRatingByUserId(String userId);

}
