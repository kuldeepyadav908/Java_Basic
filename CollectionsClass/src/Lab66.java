import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab66 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);								//[Srinivas, Dande, Abhi, Kumar, Nivas]
		System.out.println("\n SORTING IN ASCENDING ORDER");	//SORTING IN ASCENDING ORDER
		Collections.sort(list);
		System.out.println(list);								//[Abhi, Dande, Kumar, Nivas, Srinivas]
		System.out.println("\n SORTING IN DESCENDING ORDER");	// SORTING IN DESCENDING ORDER
		Collections.sort(list,new StringDescComp());
		System.out.println(list);								//[Srinivas, Nivas, Kumar, Dande, Abhi]
	}

}
class StringDescComp implements Comparator{
	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}