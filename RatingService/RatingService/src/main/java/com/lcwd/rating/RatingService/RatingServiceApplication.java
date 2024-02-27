package com.lcwd.rating.RatingService;

import com.lcwd.rating.RatingService.repository.RatingRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class RatingServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(RatingServiceApplication.class, args);
	}
}
