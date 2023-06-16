package com.emart.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentid;
	
	private String paymentmode;
	
	private String paymenttype;
	
	private int orderid;
	
	private String username;
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Orders orders;
	

}
