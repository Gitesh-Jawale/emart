package com.emart.test.dto;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	
	private String username;
	
	private String password;
	
	private String fname;
	
	private String mname;
	
	private String lname;
	
	private String email;
	
	private long mobileno;
	
	private String cardholer;
	
	private int points;
}
