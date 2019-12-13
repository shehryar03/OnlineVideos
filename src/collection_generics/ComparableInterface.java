package collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>

{
	int rollno, marks;
	String name;
	public Stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(Stud s)
	{
		return marks>s.marks?1:-1;
	}
	
}
public class ComparableInterface {

	public static void main(String[] args) 
	{
		List<Stud> studs = new ArrayList<>();
		studs.add(new Stud(23,55,"Hashir"));
		studs.add(new Stud(24,100,"Taha"));
		studs.add(new Stud(26,90,"Umair"));
		
		Collections.sort(studs);
	
	
	for(Stud s: studs)
	{
		System.out.println(s);
	}

}
}
