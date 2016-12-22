package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab640 {

	public static void main(String[] args) {
		Map mp = new LinkedHashMap();
		System.out.println("SIZE: "+mp.size());			//SIZE: 0
		System.out.println("IS EMPTY: "+mp.isEmpty());	//IS EMPTY: true
		mp.put("eid", new Integer(99));
		mp.put("Name", "SriNivas");
		mp.put("Phone", new Long(6746598l));
		mp.put("Valid", new Boolean(true));
		System.out.println(mp);							//{eid=99, Name=SriNivas, Phone=6746598, Valid=true}
		System.out.println("SIZE: "+mp.size());			//SIZE: 4
		System.out.println("IS EMPTY: "+mp.isEmpty());	//IS EMPTY: false
	}

}
