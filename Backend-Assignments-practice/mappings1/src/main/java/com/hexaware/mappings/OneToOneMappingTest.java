package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Movie1;
import com.hexaware.mappings.entities.Screen;

/**
 * Hello world!
 *
 */
public class OneToOneMappingTest {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		
		  //Movie movie = new Movie(513,"Leo",4.1);
		  
		  //Screen screen = new Screen(103,"Screen-1",movie);
		 Movie1 movie = new Movie1(516,"RRR",4.5);
		  
		  Screen screen = new Screen(105,"Screen-3",movie);
		 
		  
		  session.persist(screen);
		 

		
		tx.commit();

	}
}
