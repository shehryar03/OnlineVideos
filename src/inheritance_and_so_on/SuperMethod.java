package inheritance_and_so_on;

class V
{
	 public V()
	 {
		 System.out.println("Vehicle default contructor");
	 }
	 
	 public V(int a)
	 {
		 System.out.println("Vehicle parmeterized constructor");
	 }
	
}
class C extends V
{
	public C()
	{	super(4);
		System.out.println("Default Car");
	}
	
	public C(int a)
	{	super(a);
		System.out.println("Parameterized Car");
	}

}

public class SuperMethod 
{

	public static void main(String[] args) 
	{
		C honda = new C(); // all depends on Sub class. it will control the constructors of super class.

	}

}
