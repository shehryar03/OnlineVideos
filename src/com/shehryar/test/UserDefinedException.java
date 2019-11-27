package com.shehryar.test;
// For revision refer again to the Telusko Tutorial 4:57:00
public class UserDefinedException 
{

	public static void main(String[] args) 
	{
		int i = 8;
		int j = 9;
		
		try 
		{
		int k = i/j;
		if (k==0) throw new CustomException("This is not possible");
		}
		catch (CustomException e)
		{
			System.out.println("Error" + e.getMessage());
		}
	}

}
