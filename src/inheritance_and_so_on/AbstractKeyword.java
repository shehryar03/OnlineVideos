package inheritance_and_so_on;
/*
 * A class that may be extended in future but for now its empty and we don't want anyone to create object of
 * class directly. If we use the Keyword Abstract then no one will be able to create its object directly. 
 * But some other class can extend this class then we can reference the abstract class and create object with
 * the help of other class as show in the example //.
 */
abstract class A  
	{
		public abstract void display(); // Method declared but not defined
	}

class B extends A
	{
		public void display() // defined the super class method and it is must otherwise class B would also 
							// abstract.
		{	
			System.out.println("Implemented Abstract Method");
		}
	}


public class AbstractKeyword {

	public static void main(String[] args) 
	{
		A a1 = new B();
		a1.display();

	}

}
