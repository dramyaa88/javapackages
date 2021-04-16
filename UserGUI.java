package com.abc.bank.model;


// GUI layer providing user data
public class UserGUI {
	
	//connect GUI layer to model layer
	
	public static void main(String[] args) {
		 //connect to model layer
		User usr = new User();
		usr.setUserId("java"); //setting the data to the model layer
		usr.setPassword("6758");
		
		int result = usr.loginValidate();
		if(result == 1)
		{
			System.out.println("Welcome " +usr.getUserId());
		}
		else
		{
			System.out.println("Incorrect userId or password");
		}
				
	}

}
