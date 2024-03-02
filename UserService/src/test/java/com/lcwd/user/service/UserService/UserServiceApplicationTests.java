package com.lcwd.user.service.UserService;

import com.lcwd.user.service.UserService.entities.Rating;
import com.lcwd.user.service.UserService.externalService.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

//	@Autowired
//	private RatingService ratingService;
//	@Test
//	public void saveRating(){
//		Rating rating=Rating.builder().ratingId("790890").userId("").hotelId("").rating(7).feedback("Great Experience!!").build();
//		ResponseEntity<Rating> responseEntity=ratingService.saveRating(rating);
//		System.out.println("saved rating!!"+responseEntity.getBody());
//	}
}
