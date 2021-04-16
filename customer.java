package com.abc.bank.model;

public class customer {
	
	public String userId;
	private String password;
	protected int projectId;
	double salary;
	
	public void getCustomerDetails()
	{
		userId = "user123";
		password = "12345";
		projectId = 8003;
		salary = 50000.56d;
	}
	
	public void print()
	{
		System.out.println("user id : "+userId);
		System.out.println("password : "+password);
		System.out.println("projectId : "+projectId);
		System.out.println("salary : "+salary);
	}
	
	public static void main(String[] args) {
		customer cust = new customer();
		cust.getCustomerDetails();
		cust.print();
	}

}
