package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab644 {

	public static void main(String[] args) {
		Map mp = new LinkedHashMap();
		mp.put("eid", new Integer(99));
		mp.put("Name", "SriNivas");
		mp.put("Phone", new Long(6746598l));
		mp.put("Valid", new Boolean(true));
		System.out.println("***Key and Values***");	//***Key and Values***
		Set data = mp.entrySet();
		Iterator it = data.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			Map.Entry entry = (Map.Entry)obj;
			Object key = entry.getKey();
			Object val = entry.getValue();
			System.out.println(key+"\t"+val);		/*eid		99
													  Name		SriNivas
													  Phone		6746598
													  Valid		true	*/

		}
	}

}
