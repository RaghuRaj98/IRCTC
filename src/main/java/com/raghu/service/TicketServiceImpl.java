package com.raghu.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.raghu.request.Passenger;
import com.raghu.response.Ticket;


@Service
public class TicketServiceImpl implements TicketService {

	private Map<String , Ticket> ticketMap = new HashMap<>();
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		// logic to book the ticket

				// generating random ticket id
				String ticketNum = UUID.randomUUID().toString().replace("-", "");

				Ticket tinfo = new Ticket();
				tinfo.setTicketNum(ticketNum);
				tinfo.setTicketStatus("CONFIRMED");
				tinfo.setTicketPrice(450.00);
				tinfo.setFrom(passenger.getFrom());
				tinfo.setTo(passenger.getTo());
				tinfo.setName(passenger.getName());
				tinfo.setJdate(passenger.getJdate());
				tinfo.setTrainNum(passenger.getTrainNum());

				ticketMap.put(ticketNum, tinfo);

				return tinfo;
	}

	@Override
	public Ticket getTicket(String ticketNum) {
		if(ticketMap.containsKey(ticketNum)) {
			return ticketMap.get(ticketNum);
		}
		return null;
	}

}
