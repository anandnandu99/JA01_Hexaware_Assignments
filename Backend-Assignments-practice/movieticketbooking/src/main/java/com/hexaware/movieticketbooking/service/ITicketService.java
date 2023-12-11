package com.hexaware.movieticketbooking.service;



	import entities.Ticket;
	import java.util.List;

	public interface ITicketService {

	    Ticket getTicketById(long ticketId);

	    List<Ticket> getAllTickets();

	    List<Ticket> getTicketsByScreeningId(long screeningId);

	    void bookTicket(Ticket ticket);

	    void cancelTicket(long ticketId);
	}



