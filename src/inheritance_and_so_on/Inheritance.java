package inheritance_and_so_on;

class Vehicle
{
	int tyres;
	int doors;
public Vehicle (int tyres, int doors)
{
	this.tyres = tyres;
	this.doors = doors;
}
public Vehicle(double d) {
	// TODO Auto-generated constructor stub
}
}

class Car extends Vehicle
{
	public Car(int tyres, int doors) {
		super(tyres, doors);
		// TODO Auto-generated constructor stub
	}

	String color;
	
}

class Rickshaw extends Car
{
	public Rickshaw(int tyres, int doors) {
		super(tyres, doors);
		// TODO Auto-generated constructor stub
	}

	int seats;
}

class Bike extends Rickshaw
{
	public Bike(int tyres, int doors) {
		super(tyres, doors);
		// TODO Auto-generated constructor stub
	}

	int speed;
}
public class Inheritance {

	public static void main(String[] args) 
	{	Vehicle v1 = new Vehicle(1,2);	
		Vehicle v2 = new Vehicle(2.3);
		Vehicle v[] = new Vehicle[2];	
		

	}

}
