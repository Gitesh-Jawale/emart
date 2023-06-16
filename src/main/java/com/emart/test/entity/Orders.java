package com.emart.test.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderid;
	
	private double cardholderprice;
	
	private int cartid;
	
	private float discount;
	
	private Date orderdate;
	
	private int pointredm;
	
	private double price;
	
	private int productid;
	
	private String productname;
	
	private int qty;
	
	private String username;
	
	@ManyToOne
	private Addtocart addtocart;
	@ManyToOne
	private User user;
	@ManyToOne
	private Productmaster productmaster;
	
	@OneToMany(mappedBy="orders", cascade = CascadeType.ALL)
	private List<Payment>payment = new ArrayList<>();
	
	
}
