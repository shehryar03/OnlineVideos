package com.shehryar.test;

public class LambdaExpressionThreads 
{

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(() ->
		{
			for(int i=0;i<3; i++)
			{
			System.out.println("Samsung");
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
			
		});
		Thread t2 = new Thread(() -> {	
			for(int i=0;i<3; i++) 
			{
			System.out.println("Apple");
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
			
		});

	
	t1.start();
	try {Thread.sleep(100);} catch(Exception e) {}
	t2.start();
	
}
}
