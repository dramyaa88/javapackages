package com.abc.bank.model;

public class Visitor {
	
	static int count;
	
	Visitor()
	{
		System.out.println("Constructor");
	}
	{
		System.out.println("anonymous");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		new Visitor();
	}
	
	//static block
	static
	{
		count++;
		System.out.println("static block  1   "+count);
	}
	
	static
	{
		count++;
		System.out.println("static block  "+count);
	}

}
