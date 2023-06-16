package com.emart.test.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
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
public class Configmaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int configid;
	private String configname;
	
	@OneToMany(mappedBy="configmaster", cascade = CascadeType.ALL)
	private Set<Productdtlmaster> productdtlmasters = new HashSet<>();
}
