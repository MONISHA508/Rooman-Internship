package com.fb;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users") // Table name in MySQL
public class User {
	private String fname;
	private String lname;
	private String uname;
	private String password;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
	private Long id;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}
    
	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	

}
