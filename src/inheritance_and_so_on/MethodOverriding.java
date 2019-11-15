package inheritance_and_so_on;


class Animal
	{	int i;
		public void display()
		{
			System.out.println("Display fuction of Vehicle class");
		}
		
	}
class Cat extends Animal
{	int i;
	public void display()
	{	super.display();
		i=10;
		System.out.println("Display fuction of Car class" + i);
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) 
	{
		Cat suzuki = new Cat();
		suzuki.display();

	}

}
