package com.fbook.FaceBookBackend;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class Product {
	
	//fields
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String UserName;
	@Column (name = "Last Name")
	private String lname;
	@Column (name = "Gender")
	private String gender;
	@Column (name = "Mobile Number")
	private String mnum;
	private Date Dob;
	@Column (name = "First name")
	private String fname;
	private String Password;
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		this.Dob = dob;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMnum() {
		return mnum;
	}
	public void setMnum(String mnum) {
		this.mnum = mnum;
	}
	@Override
	public String toString() {
		return "Product [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", mnum=" + mnum + ", Dob=" + Dob
				+ ", UserName=" + UserName + ", Password=" + Password + ", getDob()=" + getDob() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getFname()=" + getFname() + ", getLname()="
				+ getLname() + ", getGender()=" + getGender() + ", getMnum()=" + getMnum() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
