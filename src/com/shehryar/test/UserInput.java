package com.shehryar.test;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(i);
		sc.close();

	}

}
