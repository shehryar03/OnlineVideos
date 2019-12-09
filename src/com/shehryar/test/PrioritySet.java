package com.shehryar.test;

public class PrioritySet {

	public static void main(String[] args) throws Exception
	{
		Thread t1 = new Thread(() ->
		{
			for(int i=0;i<3; i++)
			{
			System.out.println("Samsung" + Thread.currentThread().getPriority()); // To check the current pri
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
			
		},"Thread 1"); // option 2 for setting the name
		
		Thread t2 = new Thread(() -> {	
			for(int i=0;i<3; i++) 
			{
			System.out.println("Apple" + Thread.currentThread().getPriority());
			try{Thread.sleep(1000);} catch(Exception e) {}
			}
			
		},"Thread 2"); // option 1 for setting the name
		
	//t1.setName("Thread 1"); // option 2 for setting name
	//t2.setName("Thread 2");
	
	System.out.println(t1.getName()); // To get the name of thread
	System.out.println(t2.getName()); // To get the name of thread
	//t1.setPriority(1); // 1 is lowest 
	//t1.setPriority(10); // 10 is highest
	t1.setPriority(Thread.MAX_PRIORITY); // another way of setting the priority
	t1.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	try {Thread.sleep(100);} catch(Exception e) {}
	t2.start();
	System.out.println(t1.isAlive());
	t1.join();
	t2.join();
	System.out.println("ENDE");
	

	}

}
