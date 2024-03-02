package com.lcwd.user.service.UserService.externalService;

import com.lcwd.user.service.UserService.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    @PostMapping("/rating")
    public ResponseEntity<Rating> saveRating(Rating rating);

    @PutMapping("/{ratingId}")
    public Rating updateRating(@PathVariable String ratingId,Rating rating);

    @DeleteMapping("/{ratingId}")
    void DeleteRating(@PathVariable String ratingId);
}
