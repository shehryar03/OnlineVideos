class Test101
{
	int testno = 1;
	String testname = "test";
	
	public void display()
	{
		System.out.print(testno + " " + testname);
	}
}
public class ArrayRevision {

	public static void main(String[] args) 
	{
		/* ARRAY OF OBJECTS TESTING
		Test101 t1 = new Test101();
		Test101 t2 = new Test101();
		Test101 t[] = {t1,t2};
		//t[1] = new Test101();
		//t1.display();
		t[1].display();
		*/
		/*
		int salary[] = new int[5];
		salary[0] = 1000;
		salary[1] = 2000;
		salary[2] = 3000;
		salary[3] = 4000;
		salary[4] = 5000;
		
		for (int index = 0; index<5 ; index ++)
		{
			System.out.print(salary[index] + " ");
		}*/
		
		/*int marks[] = {30,40,77,88,99,100};
		for (int index = 0; index < marks.length; index ++)
		{
			System.out.print(marks[index] + " ");
		}*/
		
		
		int marks[][] = {
			{33,43,75,88},
			{34,42,75,49},
			{37,41,74,66} };
		
		for (int row = 0; row<marks.length; row++)
		{
			for (int column = 0; column<marks[row].length; column++)
			{
				System.out.print(marks[row][column] + " ");
			}
			System.out.println();
		}
		
	}

}
