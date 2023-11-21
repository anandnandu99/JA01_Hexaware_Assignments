package com.hexaware.mappings.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Movie1 implements Serializable {
	private static final long serialVersionUID=1L;
	@Id
	private int movieId;
	private String movieName;
	private double rating;
	
	public Movie1() {
		super();
	}

	public Movie1(int movieId, String movieName, double rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
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

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}
	
	
}
	
	