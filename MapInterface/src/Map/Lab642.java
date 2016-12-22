package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab642 {

	public static void main(String[] args) {
		Map mp = new LinkedHashMap();
		mp.put("eid", new Integer(99));
		mp.put("Name", "SriNivas");
		mp.put("Phone", new Long(6746598l));
		mp.put("Valid", new Boolean(true));
		System.out.println(mp);		//{eid=99, Name=SriNivas, Phone=6746598, Valid=true}
		System.out.println("remove(eid): "+mp.remove("eid"));//remove(eid): 99
		System.out.println(mp);		//{Name=SriNivas, Phone=6746598, Valid=true}
		System.out.println("put - phone: "+mp.put("Phone", new Long(3190876l)));//put - phone: 6746598
		System.out.println(mp);		//{Name=SriNivas, Phone=3190876, Valid=true}
		System.out.println("***get()***");		//***get()***
		System.out.println(mp.get("Name"));		//SriNivas
		System.out.println(mp.get("email"));	//null
	}

}
