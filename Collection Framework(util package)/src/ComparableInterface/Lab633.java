package ComparableInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class Lab633 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Student(87,"Sri"));
		ts.add(new Student(99,"Dande"));
		ts.add(new Student(12,"SD"));
		ts.add(new Student(45,"Nivas"));
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());		/*12	SD
												  45	Nivas
												  87	Sri
												  99	Dande */
	}

}
class Student implements Comparable{
	int sid;
	String name;
	Student(int sid,String name){
		this.sid = sid;
		this.name = name;
	}
	public int compareTo(Object obj) {
		if(obj instanceof Student){
			Student st = (Student)obj;
			return this.sid - st.sid;
		}
		return 0;
	}
	public String toString() {
		
		return sid+"\t"+name;
	}
}
