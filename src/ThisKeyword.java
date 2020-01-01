class Student
{	
	int rollno;
	String name;
	int marks;
	
	Student(int rollno, int marks)
	{
		this.rollno = rollno; // Turns same name variable into global scope or current object.
		this.marks = marks;
	}
}
public class ThisKeyword {

	public static void main(String[] args) 
	{
		Student s = new Student(40,100);
		
		System.out.println(s.rollno);
		System.out.println(s.marks);
	}

}
