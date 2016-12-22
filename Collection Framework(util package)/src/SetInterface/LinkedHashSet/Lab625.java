package SetInterface.LinkedHashSet;

import java.util.LinkedHashSet;

public class Lab625 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new Long(65));
		lhs.add(new Byte((byte)65));
		lhs.add(new Integer(65));
		lhs.add('A');
		System.out.println(lhs);			//[65, 65, 65, A]
	}

}
