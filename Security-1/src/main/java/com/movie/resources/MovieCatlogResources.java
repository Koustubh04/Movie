package com.movie.resources;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.services.CatalogService;
@RestController
@RequestMapping("/movie")
public class MovieCatlogResources {

	@RequestMapping("/{movieId}")
	public List<CatalogService> catalogService(@PathVariable("movieId") String movie_name){
		
		
		
		
		return Collections.singletonList(
				new CatalogService("001", "Titanic", "4.5")
				);
	}
}
