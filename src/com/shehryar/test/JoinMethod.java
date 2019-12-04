package com.shehryar.test;

public class JoinMethod {

	public static void main(String[] args) throws Exception
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
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println("ENDE");
		
	}

	

}
