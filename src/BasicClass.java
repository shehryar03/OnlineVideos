// Class is a blue print that is used to create the object.
// Object knows something (data) and does something (perform actions).
// To access Variable and Method we need Objects.

// A Constructor is also a member method of class it has the same name as class name.
// A doesn't return anything. e.g Calculator()
class Calculator 
{
		int num1;
		int num2;
		int result;
		
	public void display() 
	{
			result = num1 + num2 ;
	}
	
	Calculator() // Can be used to initialize the variable
	{
		num1 = 10;
		num2 = 10;
	}
	
	Calculator(int i, int j) // Parameterized Constructor
	{
		num1 = i;
		num2 = j;
	}
}

public class BasicClass {

	public static void main(String[] args) // 1st statement that is executed when a program starts
	{
		Calculator obj = new Calculator(7,7); // knows something and does something
		// knows means the data the variable and does something means the methods
		// new is the keyword that is used to instantiate an object basically it provides space (memory)
		// and next is the Constructor e.g Calc(); which tells us how much memory that object will occupy.
		// OR you can say as Constructor is used to allocate the memory to object.
		//obj.num1 = 10;
		//obj.num2 = 10;
		obj.display();
		System.out.println(obj.result);
		
	}

}
