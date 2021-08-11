package com.movie.services;

public class RatingInfo {

	
	String movieID;
	String rating;
	public String getMovieID() {
		return movieID;
	}
	public RatingInfo(String movieID, String rating) {
		super();
		this.movieID = movieID;
		this.rating = rating;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
}
