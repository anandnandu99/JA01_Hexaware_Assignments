package com.hexaware.movieticketbooking.service;


	import entities.Theatre;
	import java.util.List;

	public interface ITheatreService {

	    Theatre getTheatreById(long theatreId);

	    List<Theatre> getAllTheatres();

	    void addTheatre(Theatre theatre);

	    void updateTheatre(long theatreId, Theatre theatre);

	    void deleteTheatre(long theatreId);
	}



