package collection_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) 
	{
		//Collection values = new ArrayList(); doesn't support Index Numbers
		Collection values = new ArrayList<>();
		values.add(4);
		values.add(6);
		values.add(9);
		
		Iterator it = values.iterator(); // Iterator class is used to iterate in the collection
		
		while(it.hasNext()) // has next method is used to check if there is any element in the collection or nt
		{
		System.out.println(it.next()); // print Next element in the collection
		}
	}

}
