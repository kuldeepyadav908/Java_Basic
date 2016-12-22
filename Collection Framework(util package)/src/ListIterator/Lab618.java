package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab618 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		System.out.println(list);				//[Sri, Nivas, Dande, Java, JDBC, JSP]
		ListIterator li = list.listIterator();
		while(li.hasNext()){
			Object obj = li.next();
			System.out.println(obj);			/*Sri
												  Nivas
												  Dande
												  Java
												  JDBC
												  JSP*/
			if(obj.equals("Nivas"))
				li.remove();
			else if(obj.equals("Java"))
				li.set("Core Java");
			else if(obj.equals("JSP"))
				li.add("Servlets");
		}
		System.out.println(list);				//[Sri, Dande, Core Java, JDBC, JSP, Servlets]
	}

}
