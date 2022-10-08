package com.awanish.patterns.singleton;

public class Test {
	
	
	public static void main(String []args)
	{
		DateUtil dateutil1=DateUtil.getInstance();
		DateUtil dateutil2=DateUtil.getInstance();
		
		System.out.println(dateutil1==dateutil2);
	}

}
