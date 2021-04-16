package com.abc.bank.department.model;
// adding the class of different package to current package
import com.abc.bank.model.customer;

public class LoanCustomer extends customer{
	
	public void accessCustomerDetails()
	{
		customer obj = new customer();  
		System.out.println(obj.userId);
		obj.getCustomerDetails();
		obj.print();
		
		LoanCustomer loan = new LoanCustomer();
		loan.projectId = 786; //protected dm of diff class
		loan.userId = "ramyaa123";  // public dm of different class
		
	}

}
