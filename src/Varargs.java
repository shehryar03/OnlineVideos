class Calc 
{
		public int add(int ... n) // Will be used when you don't know how much values will be passed in the method.
		{						  // Variable Length Arguments.
			int sum = 0;
			for (int i : n)
			{
				sum = sum + i;
			}
			return sum;
		}

}


public class Varargs {

	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		System.out.println(obj.add(10, 8, 9, 10));
		

	}

}
