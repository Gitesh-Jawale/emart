package com.emart.test.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductmasterDTO {

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
}
