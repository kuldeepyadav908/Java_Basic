package ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab620 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Sri");
		list.add("Nivas");
		list.add("Dande");
		list.add("Java");
		list.add("JDBC");
		list.add("JSP");
		ListIterator li = list.listIterator(2);
		do{
			int index = li.nextIndex();
			Object obj = li.next();
			System.out.println(index+"\t"+obj);			/*2	Dande
														  3	Java
														  4	JDBC
														  5	JSP	*/
		}while(li.hasNext());
		System.out.println();
		li = list.listIterator(5);
		do{
			int index = li.previousIndex();
			Object obj = li.previous();
			System.out.println(index+"\t"+obj);			/*4	JDBC
														  3	Java
														  2	Dande
														  1	Nivas
														  0	Sri	*/
		}while(li.hasPrevious());
	}
}
