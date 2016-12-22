package SetInterface.LinkedHashSet;

import java.util.LinkedHashSet;

public class Lab622 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Sri");
		lhs.add("Nivas");
		lhs.add(99);
		lhs.add("DK");
		lhs.add("Manish");
		System.out.println(lhs);		//[Sri, Nivas, 99, DK, Manish]
	}
}
