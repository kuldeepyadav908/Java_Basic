package SetInterface.NavigableSet;

import java.util.TreeSet;

public class Lab630 {

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
		System.out.println(ts);					//[3, 4, 5, 7, 9, 10, 11, 20]
		System.out.println(ts.pollFirst());		//3
		System.out.println(ts);					//[4, 5, 7, 9, 10, 11, 20]
		System.out.println(ts.pollLast());		//20
		System.out.println(ts);					//[4, 5, 7, 9, 10, 11]
		
		System.out.println("**lower()**");		//**lower()**
		System.out.println(ts.lower(8));		//7
		System.out.println(ts.lower(3));		//null
		
		System.out.println("**higher()**");		//**higher()**
		System.out.println(ts.higher(8));		//9
		System.out.println(ts.higher(50));		//null
		System.out.println(ts.higher(3));		//4
		
		System.out.println("**ceiling()>=**");	//**ceiling()>=**
		System.out.println(ts.ceiling(8));		//9
		System.out.println(ts.ceiling(12));		//null
		
		System.out.println("**floor()<=**");	//**floor()<=**
		System.out.println(ts.floor(8));		//7
		System.out.println(ts.floor(3));		//null
	}

}
