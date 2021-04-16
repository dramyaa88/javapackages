package com.abc.bank.model;

public class BankCustomer {
	
	public static void main(String[] args) {
		
		customer obj = new customer();
		System.out.println(obj.projectId); //protected
		System.out.println(obj.salary);   //default
		System.out.println(obj.userId);  //public
		 // private access modifiers cannot be accessible
		
		obj.getCustomerDetails();
		obj.print();
	}

}
