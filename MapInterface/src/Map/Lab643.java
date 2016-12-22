package Map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab643 {

	public static void main(String[] args) {
		Map mp = new LinkedHashMap();
		mp.put("eid", new Integer(99));
		mp.put("Name", "SriNivas");
		mp.put("Phone", new Long(6746598l));
		
		//System.out.println(mp);
		System.out.println("***Key***");		//***Key***
		Set st = mp.keySet();
		Iterator it = st.iterator();
		while(it.hasNext()){
			Object key = it.next();
			System.out.println(key);			/*eid
												  Name
												  Phone */
		}
		System.out.println("***Values***");		//***Values***
		Collection col = mp.values();
		Iterator it1 = col.iterator();
		while(it1.hasNext()){
			Object val = it1.next();
			System.out.println(val);			/*99
												  SriNivas
												  6746598	*/
		}
	}

}
