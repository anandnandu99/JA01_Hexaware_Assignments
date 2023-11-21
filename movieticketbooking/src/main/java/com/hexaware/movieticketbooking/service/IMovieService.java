package com.hexaware.movieticketbooking.service;


	import entities.Movie;
	import java.util.List;

	public interface IMovieService {

	    Movie getMovieById(long movieId);

	    List<Movie> getAllMovies();

	    void addMovie(Movie movie);

	    void updateMovie(long movieId, Movie movie);

	    void deleteMovie(long movieId);
	}



