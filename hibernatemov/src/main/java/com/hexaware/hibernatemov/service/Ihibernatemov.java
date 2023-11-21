package com.hexaware.hibernatemov.service;

import com.hexaware.hibernatemov.entity.Movie;
import java.util.List;

public interface Ihibernatemov {
    void insertMovie(Movie movie);
    void updateMovie(Movie movie);
    void deleteMovieById(int movieId);
    Movie getMovieById(int movieId);
    List<Movie> getAllMovies();
}
