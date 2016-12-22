package SetInterface.NavigableSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Lab628 {

	public static void main(String[] args) {
		TreeSet	ts = new TreeSet();
		ts.add(10);
		ts.add(5);
		ts.add(7);
		ts.add(11);
		ts.add(3);
		ts.add(9);
		ts.add(4);
		ts.add(20);
		System.out.println(ts);						//[3, 4, 5, 7, 9, 10, 11, 20]
		Set st1 = ts.descendingSet();
		System.out.println(st1);					//[20, 11, 10, 9, 7, 5, 4, 3]
		System.out.println("Ascending Iterator");	//Ascending Iterator
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());			/*3
													  4
													  5
													  7
													  9
													  10
													  11
													  20 */
		System.out.println("Decending Iterator");	//Decending Iterator
		Iterator it1 = ts.descendingIterator();
		while(it1.hasNext())
			System.out.println(it1.next());			/*20
													  11
													  10
													  9
													  7
													  5
													  4
													  3	*/
	}

}
