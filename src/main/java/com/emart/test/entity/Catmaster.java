package com.emart.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Catmaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int catmasterid;
	private String catid;
	private String catimagpath;
	private String subcatid;
	private String catname;
	private String flag;
	@Column(nullable=true)
	private Integer productid;
	
	@ManyToOne
	private Productmaster productmaster;

}
