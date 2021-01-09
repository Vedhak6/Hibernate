package com.xworkz.appu.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="moviedto")
public class MovieDTO implements java.io.Serializable{
	
    
	@Id
    @Column(name="MOVIE_ID")
	private int movieId;
    
    @Column(name="Movie_NAME")
	private String movieName;
    
    @Column(name="HERO_NAME")
	private String hero;
    
    @Column(name="NO_OF_HOURS")
	private int noOfHours;
    
    @Column(name="RATING")
	private int rating;
    
    @Column(name="LANGUAGE")
    private String language;
    
	public MovieDTO( ) {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}
	
	public MovieDTO(int movieId, String movieName, String hero,int noOfHours, int rating,String language) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.hero = hero;
		this.noOfHours = noOfHours;
		this.rating = rating;
		this.language = language;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public int getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		String formattedData=String.format("%-6s%-6s%-6s%-8s%-8s%s",movieId,movieName,
				hero,noOfHours,rating,language);
		return formattedData;
	}
	
	
	

}
