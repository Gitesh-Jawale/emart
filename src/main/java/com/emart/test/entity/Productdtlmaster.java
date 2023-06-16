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
public class Productdtlmaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proudctdtlmasterid;
	private String configdtl;
	private int productid;
	private int configid;

	@ManyToOne
	private Productmaster productmaster;
	
	@ManyToOne
	private Configmaster configmaster;
}
