package com.shehryar.test;
/* There are two ways to create a Thread
 * 1. By extending Thread Class Run() method.
 * 2. By implementing Runnable Interface. Supports multiple inheritance
 */
class Samsung extends Thread
	{
		public void run()
		{
			for(int i=0;i<3; i++)
			{
			System.out.println("Samsung");
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
			
			
		}
	}	
class Apple extends Thread
	{
	public void run() 
	{	
		for(int i=0;i<3; i++) 
		{
		System.out.println("Apple");
		try{Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
	}	
public class ThreadsDemo {

	public static void main(String[] args) 
	{
		Samsung s = new Samsung();
		Apple a = new Apple();
		s.run();
		a.run();
		s.start();
		try{Thread.sleep(100);} catch(Exception e) {}
		a.start();
	}

}
