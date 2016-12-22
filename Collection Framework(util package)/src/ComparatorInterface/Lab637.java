package ComparatorInterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab637 {

	public static void main(String[] args) {
		TreeSet	ts = new TreeSet(new EnameComparator());
		ts.add(new Employees(88, "Manish"));
		ts.add(new Employees(44, "Sri"));
		ts.add(new Employees(22, "Nivas"));
		ts.add(new Employees(99, "Rahul"));
		ts.add(new Employees(77, "Abhi"));
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());		/*77	Abhi
												  88	Manish
												  22	Nivas
												  99	Rahul
												  44	Sri	*/


	}

}
class Employees{
	int eid;
	String name;
	Employees(int eid,String name){
		this.eid = eid;
		this.name = name;
	}
	public String toString() {
		
		return eid+"\t"+name;
	}
}
class EnameComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		if(obj1 instanceof Employees && obj2 instanceof Employees){
			Employees emp1 = (Employees)obj1;
			Employees emp2 = (Employees)obj2;
			return emp1.name.compareTo(emp2.name);		//Ascending Order
			//return emp2.name.compareTo(emp1.name);	//Descending Order
		}
		return 0;
	}
}
