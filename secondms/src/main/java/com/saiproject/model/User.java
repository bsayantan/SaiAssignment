package com.saiproject.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	private String username;
	private String name;
	private String email;
	private String mobileno;	
	private String password;
    public User() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", email=" + email + ", mobileno=" + mobileno
				+ ", password=" + password + "]";
	}
	public User(String username, String name, String email, String mobileno, String password) {
		super();
		this.username = username;
		this.name = name;
		this.email = email;
		this.mobileno = mobileno;
		this.password = password;
	}
	
	
	


}
