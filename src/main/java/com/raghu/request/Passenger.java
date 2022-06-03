package com.raghu.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
	private String name;
	private String email;
	private String from;
	private String to;
	private String jdate;
	private Long trainNum;
}
