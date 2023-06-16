package com.emart.test.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User implements UserDetails{

	@Id
	@Column(nullable=false)
	private String username;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String fname;
	@Column(nullable=true)
	private String mname;
	@Column(nullable=false)
	private String lname;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private long mobileno;
	@Column(nullable=true)
	private String cardholer;
	@Column(nullable=true)
	private int points;
	
	@OneToMany(mappedBy="users",cascade=CascadeType.ALL)
	private List<Useraddress> useraddress = new ArrayList<>();
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Addtocart> addtocarts = new ArrayList<>();
	
	@OneToMany(mappedBy="user",cascade=CascadeType.ALL)
	private List<Orders> orders = new ArrayList<>();
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private List<Payment>payment = new ArrayList<>();

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
