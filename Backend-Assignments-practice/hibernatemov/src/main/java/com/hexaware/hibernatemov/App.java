package com.hexaware.hibernatemov;

import com.hexaware.hibernatemov.dao.MovieDAOImpl;
import com.hexaware.hibernatemov.entity.Movie;
import com.hexaware.hibernatemov.service.Ihibernatemov;
import com.hexaware.hibernatemov.service.IhibernatemovImp;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) {
        // Initialize Hibernate session factory
        MovieDAOImpl movieDAO = new MovieDAOImpl(hibernatemovUtil.getSessionFactory());

        // Create a movie with hardcoded values
        Movie movie = new Movie();
        movie.setMov_name("Example Movie");
        movie.setRating(5);

        // Create service implementation
        Ihibernatemov movieService = new IhibernatemovImp();

        // Open a session
        Session session = hibernatemovUtil.getSessionFactory().openSession();
        // Begin a transaction
        Transaction transaction = session.beginTransaction();

        try {
            // Insert the movie into the database
            movieService.insertMovie(movie);
            System.out.println("Movie inserted: " + movie);

            // Update the movie's rating with hardcoded value
            movie.setRating(4);
            movieService.updateMovie(movie);
            System.out.println("Movie updated: " + movie);

            // Retrieve and display the movie by ID (assuming movie.getMov_id() returns a valid ID)
            Movie retrievedMovie = movieService.getMovieById(movie.getMov_id());
            System.out.println("Retrieved Movie: " + retrievedMovie);

            // Retrieve and display all movies
            System.out.println("All Movies:");
            movieService.getAllMovies().forEach(System.out::println);

            // Delete the movie by ID
            int movieIdToDelete = retrievedMovie.getMov_id();
            movieService.deleteMovieById(movieIdToDelete);
            System.out.println("Movie with ID " + movieIdToDelete + " deleted.");

            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            // Handle exceptions
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close the session
            session.close();
        }

        // Shutdown Hibernate session factory (if necessary)
        // HibernateUtil.close();
    }
}
