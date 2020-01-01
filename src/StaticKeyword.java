
class Employee
{	
	int salary;
	String name;
	int age;
	static String boss ;
	static int bonus ;
	
	static // when class is loaded which only once
	{	
		boss = "Shehryar";
		bonus = 500;
		System.out.println("Static Block");
	}
	
	public Employee() // Everytime when you create an object
	{
		salary = 500;
		name = "Taha";
		age = 20;
		System.out.println("Constructor");
	}
	
	public void display()
	{
		System.out.println(salary + " " + name + " " + age);
	}
	
}
public class StaticKeyword {

	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.display();
		e2.display();

	}

}
