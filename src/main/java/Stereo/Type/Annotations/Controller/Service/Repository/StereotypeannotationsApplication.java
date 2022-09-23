package Stereo.Type.Annotations.Controller.Service.Repository;

import Stereo.Type.Annotations.Controller.Service.Repository.stereotype.SpringMovieRecommendation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

// @Component
// 1. @Repository => Data Access Layer
// 2. @Service    => Service Layer (SpringMultiFilter + SpringContentFiltering + SpringMovieRecommendation)
// 3. @Controller => Web Layer
@SpringBootApplication
public class StereotypeannotationsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(StereotypeannotationsApplication.class);

		SpringMovieRecommendation recommendation = applicationContext.getBean(SpringMovieRecommendation.class);

		List<String> movies = recommendation.recommandMovie("");

		System.out.println(movies);

	}

}

