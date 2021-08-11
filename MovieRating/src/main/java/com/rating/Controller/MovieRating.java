package com.rating.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.dao.RatingInfo;

@RestController
@RequestMapping("/movie")
public class MovieRating {
@RequestMapping("/{movieID}")
	public RatingInfo MovieRate(@PathVariable("movieID") String movieID){
		
		return new RatingInfo(movieID, "5");
	}
}
