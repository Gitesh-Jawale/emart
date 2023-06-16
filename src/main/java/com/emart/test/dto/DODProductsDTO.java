package com.emart.test.dto;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DODProductsDTO {
	
	private Integer catmasterid;
	
	private String catid;
	
	private String catimagepath;
	
	private String subcatid;
	
	private String catname;
	
	private String flag;
	
	private Integer productid;
	
//	@Column(nullable=true)
//	private Integer productmaster_productid;
	
	private double price;

}
