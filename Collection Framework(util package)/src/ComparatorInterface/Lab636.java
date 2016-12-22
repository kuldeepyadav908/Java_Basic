package ComparatorInterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab636 {

	public static void main(String[] args) {
		TreeSet	ts = new TreeSet(new EidComparator());
		ts.add(new Employee(88, "Manish"));
		ts.add(new Employee(44, "Sri"));
		ts.add(new Employee(22, "Nivas"));
		ts.add(new Employee(99, "Rahul"));
		ts.add(new Employee(77, "Abhi"));
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());		/*22	Nivas
												  44	Sri
												  77	Abhi
												  88	Manish
												  99	Rahul	*/
	}

}
class Employee{
	int eid;
	String name;
	Employee(int eid,String name){
		this.eid = eid;
		this.name = name;
	}
	public String toString() {
		
		return eid+"\t"+name;
	}
}
class EidComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		if(obj1 instanceof Employee && obj2 instanceof Employee){
			Employee emp1 = (Employee)obj1;
			Employee emp2 = (Employee)obj2;
			return emp1.eid - emp2.eid;			//Ascending Order
			//return emp2.eid - emp1.eid;		//Descending Order
		}
		return 0;
	}
}