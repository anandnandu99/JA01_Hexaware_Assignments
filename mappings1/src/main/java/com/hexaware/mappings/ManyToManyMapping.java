package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.hexaware.mappings.entities.Customer;
import com.hexaware.mappings.entities.Movie;
import java.util.HashSet;
import java.util.Set;


public class ManyToManyMapping {
    public static void main(String[] args) {
        // Create session factory
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

            // Create movies
            Movie movie1 = new Movie();
            movie1.setTitle("Movie 1");

            Movie movie2 = new Movie();
            movie2.setTitle("Movie 2");

            // Create customers
            Customer customer1 = new Customer();
            customer1.setFirstName("John");

            Customer customer2 = new Customer();
            customer2.setFirstName("Alice");

            // Set relationships
            Set<Movie> moviesForCustomer1 = new HashSet<>();
            moviesForCustomer1.add(movie1);
            moviesForCustomer1.add(movie2);
            customer1.setMovies(moviesForCustomer1);

            Set<Movie> moviesForCustomer2 = new HashSet<>();
            moviesForCustomer2.add(movie1);
            customer2.setMovies(moviesForCustomer2);

            // Save movies and customers
            session.save(movie1);
            session.save(movie2);
            session.save(customer1);
            session.save(customer2);
            session.persist(movie1);
			session.persist(movie2);
			

            // Commit transaction
			tx.commit();


            System.out.println("Data saved successfully!");

     
            // Close session and factory
            session.close();
			sessionFactory.close();
        }
    }

