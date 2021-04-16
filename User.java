package com.abc.bank.model;
  //java bean

public class User {
	
	//private data members
	
	private String userId;
	private String password;
	
	//default constructor
	
	public User()
	{
		userId = "admin";
		password = "12345";
	}
	
	//setter methods
	
	public void setUserId(String userid)
	{
		this.userId = userid;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getUserId()
	{
		return userId;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	//connecting to business logic from model
	public int loginValidate()
	{
		//business logic layer (3rd layer)
		
		UserLoginValidation usr = new UserLoginValidation();
		return usr.loginUserValidation(userId, password);
	}

}
