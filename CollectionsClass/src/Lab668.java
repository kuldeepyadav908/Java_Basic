import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab668 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Srinivas");
		list.add("Dande");
		list.add("Abhi");
		list.add("Kumar");
		list.add("Nivas");
		System.out.println(list);					//[Srinivas, Dande, Abhi, Kumar, Nivas]
		List synList = Collections.synchronizedList(list);
		System.out.println("synch\t"+synList);		//synch	[Srinivas, Dande, Abhi, Kumar, Nivas]
		System.out.println("list\t"+list);			//list	[Srinivas, Dande, Abhi, Kumar, Nivas]
		List unModi = Collections.unmodifiableList(list);
		System.out.println("un Modi\t"+unModi);		//un Modi	[Srinivas, Dande, Abhi, Kumar, Nivas]
		System.out.println("\n**MODIFYING LIST**");	//**MODIFYING LIST**
		list.add("Manish");
		System.out.println("list\t"+list);			//list	[Srinivas, Dande, Abhi, Kumar, Nivas, Manish]
		System.out.println("un Modi\t"+unModi);		//un Modi	[Srinivas, Dande, Abhi, Kumar, Nivas, Manish]
		//unModi.add("JLCINDIA");					//java.lang.UnsupportedOperationException
	}

}
