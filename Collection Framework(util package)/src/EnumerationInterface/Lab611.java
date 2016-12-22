package EnumerationInterface;

import java.util.Enumeration;
import java.util.Vector;

public class Lab611 {

	public static void main(String[] args) {
		Vector v = new Vector();
		Enumeration en = v.elements();
		if(en.hasMoreElements())
			System.out.println(en.nextElement());
		System.out.println("Main Comleted");// Main Comleted
	}

}
