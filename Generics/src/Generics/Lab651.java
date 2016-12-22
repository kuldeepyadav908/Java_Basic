package Generics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lab651 {

	public static void main(String[] args) {
		Map<Integer,String> mp = new LinkedHashMap<Integer,String>();
		mp.put(1234, "Sri");
		mp.put(8767, "Nivas");
		mp.put(5677, "Manish");
		mp.put(2343, "Dande");
		mp.put(9898, "Dharmendra");
		Set<Entry<Integer, String>> st = mp.entrySet();
		Iterator<Map.Entry<Integer, String>> it = st.iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> entry = it.next();
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+"\t"+val);		/*1234	Sri
													  8767	Nivas
													  5677	Manish
													  2343	Dande
													  9898	Dharmendra	*/
		}
	}

}
