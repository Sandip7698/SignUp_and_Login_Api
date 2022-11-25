package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SignUp {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private Long userId;
private String firstName;
private String lastName;
private String email;
private Long phoneNo;
private String userName;
private String password;
private String address;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


 public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(Long phoneNo) {
	this.phoneNo = phoneNo;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}



}
