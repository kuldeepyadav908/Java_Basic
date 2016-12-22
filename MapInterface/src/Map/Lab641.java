package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab641 {

	public static void main(String[] args) {
		Map mp = new LinkedHashMap();
		mp.put("eid", new Integer(99));
		mp.put("Name", "SriNivas");
		mp.put("Phone", new Long(6746598l));
		mp.put("Valid", new Boolean(true));
		System.out.println(mp);									//{eid=99, Name=SriNivas, Phone=6746598, Valid=true}
		System.out.println(mp.containsKey("eid"));				//true
		System.out.println(mp.containsKey("email"));			//false
		System.out.println(mp.containsValue("SriNivas"));		//true
		System.out.println(mp.containsKey(new Integer(99)));	//false
		System.out.println(mp.containsValue("SD"));				//false
	}

}
