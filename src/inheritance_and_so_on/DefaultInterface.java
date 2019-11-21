package inheritance_and_so_on;

/* Topic: Default method in Interface,  Multiple inheritance in interfaces & static method interface
 * 
 * */
interface D

	{	
		int i =8; // treated as constant (final keyword) in interface
		static void display()
		{
			System.out.print("Default inferface method");
		}
	}
interface D1

{
	default void display()
	{
		System.out.print("Default inferface method");
	}
}

class D2 implements D, D1
{
	public void abc()
	{
		
	}
}

public class DefaultInterface {

	public static void main(String[] args) 
	
	{
		D.display(); // To call interface method with out implementing with another class.
		D d = new D2();
		//d.display();

	}

}
