package inheritance_and_so_on;
/*
 * We can achieve multiple inheritance with interface a positive point as we cant do with class.
 * BY default all the methods in interface are public abstract that we cant define them only we can
 * declare them.
 * We cant create any object of interface we can only Reference them.
 */
interface Shehryar
	{
		void print();
	}
class Taha implements Shehryar
	{
		public void print()
		{
			System.out.println("Ich bin Taha");
		}
	}

class Umair implements Shehryar
	{
		public void print()
		{
			System.out.println("I m Umair");
		}
	}

class Zuhaib 
	{
		public void display(Shehryar s)
		{
			s.print();
		} 
		
	
	}

public class Interfaces {

	public static void main(String[] args) 
	{
		Zuhaib z = new Zuhaib();
		Shehryar u = new Umair();
		Shehryar t = new Taha();
		
		z.display(t);
		z.display(u);

	}

}
