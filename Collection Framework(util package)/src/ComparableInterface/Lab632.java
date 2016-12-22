package ComparableInterface;

import java.util.TreeSet;

public class Lab632 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Employee());
		ts.add(new Employee());
		ts.add(new Employee());
		ts.add(new Employee());
		ts.add(new Employee());
		System.out.println(ts);		//java.lang.ClassCastException
	}

}
class Employee{
	
}
