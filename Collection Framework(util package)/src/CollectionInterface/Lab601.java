package CollectionInterface;

import java.util.*;

public class Lab601 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("Dande");
		System.out.println(col+"\t"+col.size());		//[Sri, Srinivas, Dande]	3
		Collection col2 = new ArrayList();
		col2.add("Java");
		col2.add("JDBC");
		col2.add("JSP");
		System.out.println(col2+"\t"+col2.size());		//[Java, JDBC, JSP]		3
		col.add(col2);
		System.out.println(col+"\t"+col.size());		//[Sri, Srinivas, Dande, [Java, JDBC, JSP]]		4
	}

}
