package SetInterface.HashSet;

import java.util.HashSet;

public class Lab627 {

	public static void main(String[] args) {
		HashSet hset = new HashSet();
		hset.add(new Students(99));
		hset.add(new Students(99));
		hset.add(new Students(99));
		hset.add(new Students(99));
		System.out.println(hset);
	}
}
class Students{
	int sid;
	Students(int sid){
		this.sid = sid;
	}
	public String toString() {
		return ""+sid;
	}
	public int hashCode() {
		System.out.println("***hashCode()***");
		return sid;
	}
	public boolean equals(Object obj) {
		System.out.println("***equals()***");
		if(obj instanceof Students){
			Students st = (Students)obj;
			return this.sid == st.sid;
		}
		return false;
	}
}


/*
 * Output
 * ======

***hashCode()***
***hashCode()***
***equals()***
***hashCode()***
***equals()***
***hashCode()***
***equals()***
[99]
*/