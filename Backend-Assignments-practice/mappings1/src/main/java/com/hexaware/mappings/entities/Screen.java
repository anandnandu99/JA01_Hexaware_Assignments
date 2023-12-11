package com.hexaware.mappings.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Screen implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private static final long serialVersionUID = 1L;

	@Id
	private int screenId;
	private String screenName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "movid")  // FK
	private Movie1 movie;

	public Screen() {
		super();
	}
	public Screen(int screenId, String screenName, Movie1 movie) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.movie = movie;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Movie1 getMovie() {
		return movie;
	}
	public void setMovie(Movie1 movie) {
		this.movie = movie;
	}

	
	
}

	