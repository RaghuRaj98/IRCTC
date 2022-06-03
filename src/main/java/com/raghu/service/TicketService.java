package com.raghu.service;

import com.raghu.request.Passenger;
import com.raghu.response.Ticket;


public interface TicketService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(String ticketNum);
}
