package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab619 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator li = list.listIterator();
		System.out.println("FORWARD ORDER");			//FORWARD ORDER
		while(li.hasNext()){
			int index = li.nextIndex();
			Object obj = li.next();
			
			System.out.println(index+"\t"+obj);			/*0	Sri
														  1	Nivas
														  2	Dande
														  3	Java
														  4	JDBC
														  5	JSP */
		}
		System.out.println("REVERSE ORDER");			//REVERSE ORDER
		while(li.hasPrevious()){
			int index = li.previousIndex();
			Object obj = li.previous();
			
			System.out.println(index+"\t"+obj);			/*5	JSP
														  4	JDBC
														  3	Java
														  2	Dande
														  1	Nivas
														  0	Sri	*/
		}
	}

}