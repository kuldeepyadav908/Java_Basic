package EnumerationInterface;

import java.util.Enumeration;
import java.util.Vector;

public class Lab612 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("Sri");
		v.add("Nivas");
		v.add("Dande");
		v.add("SD");
		System.out.println(v);//[Sri, Nivas, Dande, SD]
		Enumeration en = v.elements();
		//if(en.hasMoreElements())
			//System.out.println(en.nextElement());// Sri
		while(en.hasMoreElements())
			System.out.println(en.nextElement());/*Sri
												   Nivas
												   Dande
												   SD*/
	}

}
