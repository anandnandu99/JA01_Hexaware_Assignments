package com.hexaware.hibernatemov.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	private int mov_id;
	private String mov_name;
	private int rating;
	public Movie() {
		super();
	}
	
	public int getMov_id() {
		return mov_id;
	}

	public void setMov_id(int mov_id) {
		this.mov_id = mov_id;
	}

	public String getMov_name() {
		return mov_name;
	}

	public void setMov_name(String mov_name) {
		this.mov_name = mov_name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [mov_id=" + mov_id + ", mov_name=" + mov_name + ", rating=" + rating + "]";
	}
	
	

}
