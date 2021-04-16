package com.abc.bank.department.model;

public class Singleton {
	private static Singleton obj = null;
	
	public String s;
	
	private Singleton()
	{
		s = "String is in Singleton";
	}
	
	public static Singleton Singleton()
	{
		if(obj == null)
		{
			obj = new Singleton();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Singleton s1 = Singleton.Singleton();
		Singleton s2 = Singleton.Singleton();
		Singleton s3 = Singleton.Singleton();
		
	}
	
}
