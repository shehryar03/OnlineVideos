package com.shehryar.test;

class S implements Runnable
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
class A implements Runnable
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

public class RunnableInterfaceThreads {

	public static void main(String[] args) 
	{
		Runnable s = new S();
		Runnable a = new A();
		Thread t1 = new Thread(s); // Thread object must for Runnable Interface. instead of s.run();
		Thread t2 = new Thread(a);
		t1.start();
		try {Thread.sleep(100);} catch(Exception e) {}
		t2.start();
	}

}
