package com.lcwd.rating.RatingService.repository;

import com.lcwd.rating.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating,String> {

     List<Rating> findByHotelId(String hotelId);
     List<Rating> findByUserId(String userId);
}
