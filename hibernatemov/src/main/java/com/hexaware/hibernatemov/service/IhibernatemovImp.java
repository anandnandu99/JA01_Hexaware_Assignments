package com.hexaware.hibernatemov.service;

import java.util.List;

import com.hexaware.hibernatemov.hibernatemovUtil;
import com.hexaware.hibernatemov.dao.MovieDAO;
import com.hexaware.hibernatemov.dao.MovieDAOImpl;
import com.hexaware.hibernatemov.entity.Movie;

public class IhibernatemovImp implements Ihibernatemov {
    private MovieDAO movieDAO = new MovieDAOImpl(hibernatemovUtil.getSessionFactory());

    @Override
    public void insertMovie(Movie movie) {
        movieDAO.insertMovie(movie);
    }

    @Override
    public void updateMovie(Movie movie) {
        movieDAO.updateMovie(movie);
    }

    @Override
    public void deleteMovieById(int movieId) {
        movieDAO.deleteMovieById(movieId);
    }

    @Override
    public Movie getMovieById(int movieId) {
        return movieDAO.getMovieById(movieId);
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }
}
