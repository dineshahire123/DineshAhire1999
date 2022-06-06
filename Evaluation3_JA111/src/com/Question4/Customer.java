package com.Question4;

public class Customer {
 
	
  private String userName;
  private String mobileNumber;
  private String email;
  private String password;
public Customer() {
	super();
}
public Customer(String userName, String mobileNumber, String email,String password) {
	super();
	this.userName = userName;
	this.mobileNumber = mobileNumber;
	this.email = email;
	this.password = password;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
//	String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    if(userName.length()>3 && userName.length()<8 )
    {
    	this.userName = userName;
    }
    else
	{
		System.out.println("Enter valid User Name");
	}
}

public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	if(mobileNumber.length()==10)
	{
	this.mobileNumber = mobileNumber;
	}
	else
	{
		System.out.println("Enter valid Mobile Number");
	}
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	if(password.length()>3 && password.length()<8 )
    {
		this.password = password;
    }
	
	else
	{
		System.out.println("Enter valid Password");
	}
	
}

  
  
}
