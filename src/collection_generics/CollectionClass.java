package collection_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>();
		values.add(779);
		values.add(551);
		values.add(333);
		values.add(666);
		
	/*for(int i=0; i<values.size();i++)
	{
		System.out.println(values.get(i));
	}*/
	Comparator<Integer> c = (Integer i, Integer j) -> i%10>j%10?1:-1;
	Collections.sort(values, c);
	for (Object o: values)
	{
		System.out.println(o);
	}
	}

}
