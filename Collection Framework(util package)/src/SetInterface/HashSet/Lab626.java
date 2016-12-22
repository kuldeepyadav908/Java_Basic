package SetInterface.HashSet;

import java.util.HashSet;

public class Lab626 {

	public static void main(String[] args) {
		HashSet hset = new HashSet();
		hset.add(new Student(99));
		hset.add(new Student(99));
		hset.add(new Student(99));
		hset.add(new Student(99));
		System.out.println(hset);
	}

}
class Student{
	int sid;
	Student(int sid){
		this.sid = sid;
	}
	public String toString() {
		return ""+sid;
	}
}
