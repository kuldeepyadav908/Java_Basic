package SetInterface.HashSet;

import java.util.HashSet;

public class Lab621 {

	public static void main(String[] args) {
		HashSet hset = new HashSet();
		hset.add("Sri");
		hset.add("Nivas");
		hset.add(99);
		hset.add("DK");
		hset.add("Manish");
		System.out.println(hset);			//[Nivas, 99, DK, Sri, Manish]
	}

}
