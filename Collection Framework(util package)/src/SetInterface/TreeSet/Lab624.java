package SetInterface.TreeSet;

import java.util.TreeSet;

public class Lab624 {

	public static void main(String[] args) {
		TreeSet tset = new TreeSet();
		tset.add("Sri");
		tset.add("Nivas");
		tset.add(99);					//java.lang.ClassCastException
		tset.add("DK");
		tset.add("Manish");
		System.out.println(tset);

	}

}
