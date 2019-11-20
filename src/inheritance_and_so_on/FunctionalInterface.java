package inheritance_and_so_on;
/* There are 3 types of Interfaces
 * 1. Normal (may have multiple methods)
 * 2. Functional Interface (Allows only one method) It allows the use of Lambda Expression - Derived from Scala
 * 3. Marked Interface
 * */

interface H
	{
		void display();
	}

public class FunctionalInterface {

	public static void main(String[] args) 
	{
		H obj = () -> System.out.print("Lambda Expression Example"); // Lambda Exp Only works with one methd
		obj.display();

	}

}
