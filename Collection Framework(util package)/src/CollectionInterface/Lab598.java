package CollectionInterface;

import java.util.*;

public class Lab598 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("Sri");
		col.add("Srinivas");
		col.add("SD");
		col.add("Dande");
		System.out.println(col.contains("Srinivas"));	//true
		System.out.println(col.contains("Java"));		//false
		System.out.println(col);						//[Sri, Srinivas, SD, Dande]
		System.out.println(col.remove("JDBC"));			//false
		System.out.println(col.remove("Srinivas"));		//true
		System.out.println(col);						//[Sri, SD, Dande]
		col.clear();
		System.out.println(col);						//[]
		System.out.println(col.size());					//0
	}

}
