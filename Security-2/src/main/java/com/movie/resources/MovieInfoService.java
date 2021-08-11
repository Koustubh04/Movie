package com.movie.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.Dao.InfoItems;

@RestController
@RequestMapping("movie")
public class MovieInfoService {
@RequestMapping("/{movieId}")
	public List<InfoItems> MovieInfoService(String MovieId) {
		
		return Collections.singletonList(
				new InfoItems("001","Transformer")
				);
	}
	
}
