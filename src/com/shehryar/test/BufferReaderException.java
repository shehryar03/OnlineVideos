package com.shehryar.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*Buffer Reader is used to take Input from the user
 * We will also learn how to use throws exception with it.
 * IO exception are part of checked exceptions(compiler know about some exception)so we have to use 
 * throws for unchecked exception i.e ArrayIndex
 * OutofBound Exception we don't have to use the throws exception we can use try catch for that.
 * */

public class BufferReaderException  
{

	public static void main(String[] args) throws Exception 
	{
		int n = 0;
		System.out.println("Enter a number");
		BufferedReader br = null;
		try 
		{
		br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			br.close(); // To close the resource stream not sure about this
		}
		System.out.println(n);

	}

}
