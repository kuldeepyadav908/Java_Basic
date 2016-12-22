import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab665 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);				//[Srinivas, Dande, Abhi, Kumar, Nivas]
		System.out.println("\n REVERSE");		//REVERSE
		Collections.reverse(list);
		System.out.println(list);				//[Nivas, Kumar, Abhi, Dande, Srinivas]
		System.out.println("\n ROTATE(2)");		//ROTATE(2)
		Collections.rotate(list, 2);
		System.out.println(list);				//[Dande, Srinivas, Nivas, Kumar, Abhi]
		System.out.println("\n ROTATE(-3)");	// ROTATE(-3)
		Collections.rotate(list, -3);
		System.out.println(list);				//[Kumar, Abhi, Dande, Srinivas, Nivas]
		System.out.println("\n SHUFFLE");		//SHUFFLE
		for(int i=0;i<list.size();i++){
			Collections.shuffle(list);
			System.out.println(list); 			/*[Srinivas, Nivas, Kumar, Dande, Abhi]
												  [Nivas, Abhi, Kumar, Srinivas, Dande]
												  [Srinivas, Abhi, Kumar, Nivas, Dande]
												  [Abhi, Nivas, Kumar, Dande, Srinivas]
												  [Srinivas, Abhi, Kumar, Nivas, Dande]	*/
		}
	}

}
