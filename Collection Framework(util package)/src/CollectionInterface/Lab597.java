package CollectionInterface;

import java.util.*;

public class Lab597 {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		System.out.println(col);						//[]
		System.out.println("Size: "+col.size());		//Size: 0
		System.out.println("Empty:"+col.isEmpty());		//Empty:true
		System.out.println();
		col.add("Sri");
		col.add("Nivas");
		col.add("Srini");
		col.add("SD");
		col.add("Dande");
		System.out.println("Size: "+col.size());		//Size: 5
		System.out.println("Empty:"+col.isEmpty());		//Empty:false
	}

}
