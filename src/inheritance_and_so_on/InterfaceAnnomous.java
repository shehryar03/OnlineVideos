package inheritance_and_so_on;

interface Computer
	{	
		public void display();
		
	}

public class InterfaceAnnomous {

	public static void main(String[] args) 
	{
		Computer c = new Computer() /// ANNONOMOUS CLASS // CAN CREATE ANNOYMOUS INTERFACE OBJECT
				{
				public void display()
				{
					System.out.println("Laptop");
				}
				};
		c.display();
	}

}
