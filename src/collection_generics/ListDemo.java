package collection_generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class ListDemo {

	public static void main(String[] args) 
	{
		List values = new ArrayList();
		values.add(7);
		values.add(9);
		values.add(1,4);
		values.add(10);
	
	
	/*for(int i=0; i<values.size();i++)
	{
		System.out.println(values.get(i));
	}*/
	
	for (Object o: values)
	{
		System.out.println(o);
	}

}
}