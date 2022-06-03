package com.raghu.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	private String name;
	private String from;
	private String to;
	private String jdate;
	private Long trainNum;
	private String ticketNum;
	private String ticketStatus;
	private Double ticketPrice;
}
