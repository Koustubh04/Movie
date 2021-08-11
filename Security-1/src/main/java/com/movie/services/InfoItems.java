package com.movie.services;

public class InfoItems {

String movie_id;
String name;
public String getMovie_id() {
	return movie_id;
}
public void setMovie_id(String movie_id) {
	this.movie_id = movie_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public InfoItems(String movie_id, String name) {
	super();
	this.movie_id = movie_id;
	this.name = name;
}
	
}
