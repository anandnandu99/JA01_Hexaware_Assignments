package com.hexaware.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mappings.entities.Hall;
import com.hexaware.mappings.entities.MovieShow;

public class OneToMany_ManyToOne {

    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        // Create MovieShow objects
        MovieShow show1 = new MovieShow();
        show1.setShowId(101);
        show1.setShowName("Morning Show");

        MovieShow show2 = new MovieShow();
        show2.setShowId(102);
        show2.setShowName("Afternoon Show");

        MovieShow show3 = new MovieShow();
        show3.setShowId(103);
        show3.setShowName("Evening Show");

        // Save MovieShow objects to the session
        session.save(show1);
        session.save(show2);
        session.save(show3);

        // Create a new Hall instance with a different identifier
        Hall hall = new Hall();
        hall.setHallId(20); // Use a different identifier
        hall.setHallName("Hall A");

        // Add MovieShow objects to the Hall object
        hall.addShow(show1);
        hall.addShow(show2);
        hall.addShow(show3);

        // Save the Hall object
        session.save(hall);

        tx.commit();
        session.close();
    }
}

