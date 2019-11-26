package com.shehryar.test;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		try 
		{
			int a[] = new int[5];
			a[2]=3;
			int i = 8/2;
			System.out.println(i);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexoutofbound");
		}
		
		
		finally // This block always gets executed
		{
			System.out.print("Finally Block");
		}

	}

}
