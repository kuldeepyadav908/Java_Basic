import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab661 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Anand");
		list.add("Kumar");
		System.out.println("list1: "+list);			//list1: [Srinivas, Dande, Anand, Kumar]
		
		//Copy to One List to another List
		
		List list1 = new ArrayList();
		list1.add("Java");
		list1.add("Jdbc");
		list1.add("Servlets");
		list1.add("Jsp");
		System.out.println("list2: "+list1);		//list2: [Java, Jdbc, Servlets, Jsp]
		Collections.copy(list1, list);
		System.out.println("list2: "+list1); 		//list2: [Srinivas, Dande, Anand, Kumar]
	}

}
