package ComparatorInterface;

import java.util.TreeSet;

public class Lab635 {

	public static void main(String[] args) {
		TreeSet	ts = new TreeSet();
		ts.add(new Student(99,"Sri"));
		System.out.println(ts); 		//java.lang.ClassCastException

	}
}
class Student{
	int sid;
	String name;
	Student(int sid,String name){
		this.sid = sid;
		this.name = name;
	}
	public String toString() {
		
		return sid+"\t"+name;
	}
}