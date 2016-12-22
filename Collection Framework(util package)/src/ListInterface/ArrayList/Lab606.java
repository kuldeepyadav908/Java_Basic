package ListInterface.ArrayList;

import java.util.*;

public class Lab606 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		System.out.println(list);		//[Sri, Nivas, Dande]
		list.add(1,"Java");
		System.out.println(list);		//[Sri, Java, Nivas, Dande]
		list.remove(2);
		System.out.println(list);		//[Sri, Java, Dande]
	}

}