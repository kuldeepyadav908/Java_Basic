package IteratorInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab615 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		System.out.println(list);//[Sri, Nivas, Dande]
		Iterator it = list.iterator();
		int size = list.size();
		System.out.println(size);//3
		//list.remove("Sri");//java.util.ConcurrentModificationException
		//if(it.hasNext())
			//System.out.println(it.next());//Sri
		for(int i = 0;i<size;i++)
			System.out.println(it.next());		/*Sri
												  Nivas
												  Dande*/
		System.out.println("Main Completed");//Main Completed
	}

}
