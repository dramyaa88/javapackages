package com.abc.bank.model;

public class UserLoginValidation {
	
	public int loginUserValidation(String uid, String pass)
	{
		System.out.println("Welcome to business logic layer");
		if (uid.equals("java") && (pass.equals("6758")))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
