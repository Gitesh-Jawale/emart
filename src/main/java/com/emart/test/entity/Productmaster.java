package com.emart.test.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Productmaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;
	private double cardholderprice;
	private float discount;
	private int pointredm;
	private double price;
	private String productimagpath;
	private String productshortdesc;
	@Column(length=100000)
	private String productlongdesc;
	private String productname;
	
	@OneToMany(mappedBy="productmaster", cascade = CascadeType.ALL)
	private Set<Productdtlmaster> productdtlmasters = new HashSet<>();
	
	@OneToMany(mappedBy="productmaster", cascade = CascadeType.ALL)
	private Set<Catmaster> catmasters = new HashSet<>();
	
	@OneToMany(mappedBy="productmaster", cascade = CascadeType.ALL)
	private Set<Addtocart> addtocarts = new HashSet<>();
	
	@OneToMany(mappedBy="productmaster",cascade=CascadeType.ALL)
	private List<Orders> orders = new ArrayList<>();
}
