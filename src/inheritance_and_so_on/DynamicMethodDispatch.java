package inheritance_and_so_on;

class Cellphone
{	
	public void display()
	{
		System.out.println("Display method of Cellphone class");
	}
	
}

class Samsung extends Cellphone
{	
	public void display()
	{	
		//super.display();
		System.out.println("Display method of Samsung class");
	}
	
	public void config()
	{
		System.out.println("In config");
	}
}

class Iphone extends Cellphone
{
	public void display()
	{
		System.out.println("In Iphone");
	}
	
}

public class DynamicMethodDispatch 
{
// We have 2 concepts here 1. Compile time and Run time
	public static void main(String[] args) 
	{
		Cellphone s1 = new Samsung(); // runtime polymorphism. Method overriding = runtime polymorphism.
		s1.display();
		// s1.config(); // Error because there is no method of config in Superclass.
		s1 = new Iphone(); // once you change the object is called Dynamic Method Dispatch.
		s1.display(); 
	}

}
