
public class NestedLoops 
{

	public static void main(String[] args) 
	{ 
		/* 
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		1 2 3 4 5 6 
		 
		for (int i=1; i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
				System.out.println();
		} */
		
		/* $ $ $ $
		 * $     $
		 * $     $
		 * $ $ $ $
		 */
		for(int i =1; i<=4; i++)
		{   
			for (int j = 1; j <= 4; j++) 
			{	if (i==1 || i==4 || j ==1 || j ==4)
				System.out.print("$" + " ");
			else
				System.out.print(" " + " ");
			}
			System.out.println();
		}

	}
}
