package com.hexaware.hibernatemov.dao;

import com.hexaware.hibernatemov.entity.Movie;
import java.util.List;

public interface MovieDAO {
    void insertMovie(Movie movie);
    void updateMovie(Movie movie);
    void deleteMovieById(int movieId);
    Movie getMovieById(int movieId);
    List<Movie> getAllMovies();
}
