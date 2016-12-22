import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab664 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Nivas");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);								//[Srinivas, Dande, Nivas, Kumar, Nivas]
		System.out.println("\n REPLACING SRINIVAS WITH JLC");	//REPLACING SRINIVAS WITH JLC
		Collections.replaceAll(list, "Nivas", "JLC");
		System.out.println(list);								//[Srinivas, Dande, JLC, Kumar, JLC]
		Object mx = Collections.max(list);
		System.out.println("\n MAX OBJ: "+mx);					//MAX OBJ: Srinivas
		Object mn = Collections.min(list);
		System.out.println("\n MIN OBJ: "+mn);					//MIN OBJ: Dande
		System.out.println("\n REPLACING ALL WITH JLC");		//REPLACING ALL WITH JLC
		Collections.fill(list, "JLC");
		System.out.println(list); 								//[JLC, JLC, JLC, JLC, JLC]
		}

}
