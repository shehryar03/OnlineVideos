////class Calc 
////{
////		public int add(int ... n) // Will be used when you don't know how much values will be passed in the method.
////		{						  // Variable Length Arguments.
////			int sum = 0;
////			for (int i : n)
////			{
////				sum = sum + i;
////			}
////			return sum;
////		}
//
//}
class Aggregation
{
	public int addition(int ...n)
	{	int sum = 0;
		for(int adder:n)
		{
			sum = sum + adder;
		}
		System.out.print(sum);
		return sum;
	}
}
public class Varargs {

	public static void main(String[] args) 
	{
		//Calc obj = new Calc();
		//System.out.println(obj.add(10, 8, 9, 10));
		Aggregation result = new Aggregation();
		result.addition(10,10,10);

	}

}

