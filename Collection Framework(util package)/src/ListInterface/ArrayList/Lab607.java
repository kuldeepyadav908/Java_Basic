package ListInterface.ArrayList;

import java.util.*;

public class Lab607 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		System.out.println(list);		//[sri, Nivas, Dande]
		list.set(1, "Java");
		System.out.println(list);		//[Sri, Java, Dande]
		Object obj = list.get(2);
		System.out.println(obj);		//Dande
	}

}
