package com.emart.test.entity;

import java.util.ArrayList;
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
public class Addtocart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addtocartid;
	
	private int productid;
	
	private String productname;
	
	private String productimagpath;
	
	private String productshortdesc;
	
	private double price;
	
	private double cardholderprice;
	
	private int pointredm;
	
	private float discount;
	
	private int qty;
	
	private String username;
	
	@ManyToOne
	private Productmaster productmaster;
	
	@ManyToOne
	private User user;
	
	@OneToMany(mappedBy="addtocart", cascade=CascadeType.ALL)
	private List<Orders> orders= new ArrayList<>();
	
}
