package com.movie.services;

public class CatalogService {

String movie_id;
String movie_name;
String movie_rating;
public String getMovie_id() {
	return movie_id;
}
public void setMovie_id(String movie_id) {
	this.movie_id = movie_id;
}
public CatalogService(String movie_id, String movie_name, String movie_rating) {
	super();
	this.movie_id = movie_id;
	this.movie_name = movie_name;
	this.movie_rating = movie_rating;
}
public String getMovie_name() {
	return movie_name;
}
public void setMovie_name(String movie_name) {
	this.movie_name = movie_name;
}
public String getMovie_rating() {
	return movie_rating;
}
public void setMovie_rating(String movie_rating) {
	this.movie_rating = movie_rating;
}


	
}
