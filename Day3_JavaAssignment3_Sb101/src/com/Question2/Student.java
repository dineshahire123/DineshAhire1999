package com.Question2;

import java.io.Serializable;

public class Student implements Serializable {

	 private int roll;
	 private String name;
	 private Address address;
	 private String email;
	public Student() {
		super();
	}
	public Student(int roll, String name, Address address, String email) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.
		email = email;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	 
}
