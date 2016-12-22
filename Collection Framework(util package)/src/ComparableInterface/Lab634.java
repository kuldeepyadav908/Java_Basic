package ComparableInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab634 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Employees(87,"Sri"));
		ts.add(new Employees(99,"Dande"));
		ts.add(new Employees(12,"SD"));
		ts.add(new Employees(45,"Nivas"));
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());

	}

}
class Employees implements Comparable{
	int eid;
	String name;
	Employees(int eid,String name){
		this.eid = eid;
		this.name = name;
	}
	public int compareTo(Object obj) {
		if(obj instanceof Employees){
			Employees emp = (Employees)obj;
			return this.name.compareTo(emp.name);
		}
		return 0;
	}

	public String toString() {
		return eid+"\t"+name;
	}
}