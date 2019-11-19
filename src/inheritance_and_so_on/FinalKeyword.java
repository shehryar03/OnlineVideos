package inheritance_and_so_on;

final class Mobilephone // Unextendable class
{
	final double PI = 3.14; // constant variable should be in Capital due to naming convention
	public final void show() // Cannot Override this Method.
	{
		
	}
	
	Mobilephone()
	{}
}


public class FinalKeyword {

	public static void main(String[] args) 
	{
		Mobilephone s1 = new Mobilephone();
		System.out.print(s1.PI);

	}

}
