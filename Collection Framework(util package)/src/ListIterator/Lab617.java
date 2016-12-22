package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab617 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator li = list.listIterator();
		while(li.hasNext()){
			Object obj = li.next();
			System.out.println(obj);		/*Sri
											  Nivas
											  Dande
											  Java
											  JDBC
											  JSP */
		}
	}

}
