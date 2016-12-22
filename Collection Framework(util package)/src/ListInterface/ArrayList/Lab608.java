package ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab608 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("Nivas");
		list.add("JDBC");
		System.out.println(list);			//[Sri, Nivas, Dande, Java, Nivas, JDBC]
		int x = list.indexOf("Nivas");
		System.out.println(x);				// 1
		int y = list.lastIndexOf("Nivas");
		System.out.println(y);				// 4 
	}

}
