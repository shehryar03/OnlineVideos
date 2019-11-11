
public class Arrays2d {

	public static void main(String[] args) 
	{
//		int a [] = {1,2,3,4};
//		for (int j:a) 
//		{
//			System.out.print(j);
//			
//		}
		
		
		
		int a[][] = 
			{
					{1,2,3,4},
					{5,6,7},
					{8,9,5,8},
					{12,99}
				
			};
		
	for (int k[]:a) // We have to use [] brackets for 2d array or Jagged Array
	{
		for(int l:k) 
		{
			System.out.print(" " + l);
		}
		
		System.out.println();
	}

	}
	}

 
