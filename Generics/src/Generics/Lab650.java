package Generics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab650 {

	public static void main(String[] args) {
		System.out.println("***Using Generics with Set***");
		Set<String> st = new HashSet<String>();
		st.add("Srinivas");				
		st.add("Manish");
		st.add("Dharmendra");
		st.add("Dande");
		//lt.add(new Integer(12));
		Iterator<String> it = st.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);

	}
	}
}
