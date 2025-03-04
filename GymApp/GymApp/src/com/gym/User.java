package com.gym;

public class User {
private String firstname;
private String lastname;
private String username;
private String password;
public User(String firstname, String last, String username, String password) {
	super();
	this.firstname = firstname;
	this.lastname = last;
	this.username = username;
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLast() {
	return lastname;
}
public void setLast(String last) {
	this.lastname = last;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "User [firstname=" + firstname + ", last=" + lastname + ", username=" + username + ", password=" + password
			+ "]";
}

}
