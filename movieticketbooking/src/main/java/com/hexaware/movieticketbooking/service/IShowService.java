package com.hexaware.movieticketbooking.service;


	import entities.Show;
	import java.util.List;

	public interface IShowService {

	    Show getShowById(int screeningId);

	    List<Show> getAllShows();

	    List<Show> getShowsByMovie(String movieName);

	    List<Show> getShowsByTheatre(long theatreId);

	    void addShow(Show show);

	    void updateShow(int screeningId, Show show);

	    void deleteShow(int screeningId);
	}


