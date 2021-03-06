/* Q. Why we need an Inner Class instead we can make another separate class to achieve our purpose?
 * A. Sometimes there is a requirement Its only used when with the outer class to full fill the purpose
 * ONLY PURPOSE IS TO WORK WITH OUTER CLASS. 
 * */
class Outer 
{
	int a;
	public void show()
	{
		System.out.println("In Display Outer Class");
	}
	class Inner
	{
		public void display()
		{
			System.out.println("In Display Inner Class");
		}
	
	}
	static class InnerStatic
	{
		public void display()
		{
			System.out.println("In Display Static Class");
		}
	
	}
}
public class InnerClass 
{
	
	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		obj.show();
		Outer.Inner obj1 = obj.new Inner(); // We need Outer class object for non static class.
		Outer.InnerStatic obj2 = new Outer.InnerStatic(); // We don't need object of outer class to create static inner class object. 
		obj1.display();
		obj2.display();
		
	}

}  
