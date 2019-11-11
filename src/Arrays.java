class Friends
{
	int cellno;
	String name;
	
	public void display()
	{
		System.out.println(cellno);
		
	}

}


public class Arrays {

	public static void main(String[] args) 
	{
	
		int nums[] =  {1,2,3,4};
		int nums1[] = new int[4]; // In Java we need to mention new while creating an array as Array is an object in Java. 
		nums1[0]=8;
		nums1[1]=18;
		nums1[2]=28;
		nums1[3]=38;
		for(int i=0;i<4;i++)
		{	
			System.out.println(nums[i]);
		}
		
	}

}
