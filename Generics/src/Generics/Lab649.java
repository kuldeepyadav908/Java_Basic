package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab649 {

	public static void main(String[] args) {
		System.out.println("***Using Generics with List***");
		List<String> lt = new ArrayList<String>();
		lt.add("Srinivas");				
		lt.add("Manish");
		lt.add("Dharmendra");
		lt.add("Dande");
		//lt.add(new Integer(12));
		Iterator<String> it = lt.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);			/*Srinivas
												  Manish
												  Dharmendra
												  Dande	*/
		}
	}

}
