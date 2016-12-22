package ComparatorInterface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Lab638 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new StringDescComparator());
		ts.add("Manish");
		ts.add("Sri");
		ts.add("Nivas");
		ts.add("DK");
		ts.add("Rahul");
		Iterator it = ts.iterator();
		while(it.hasNext())
			System.out.println(it.next());		/*DK
												  Manish
												  Nivas
												  Rahul
												  Sri	*/
	}

}
class StringDescComparator implements Comparator{
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof String && ob2 instanceof String){
			String str1 = (String)ob1;
			String str2 = (String)ob2;
			return str1.compareTo(str2);		//Asce
			//return str2.compareTo(str1);		//Dec
		}
		return 0;
	}
}