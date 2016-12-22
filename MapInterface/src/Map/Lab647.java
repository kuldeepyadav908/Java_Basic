package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Lab647 {

	public static void main(String[] args) {
		System.out.println("***TreeMap***");		//***TreeMap***
		Map mp = new TreeMap();
		mp.put("sid", "JLC-99");
		mp.put("name", "Sri");
		mp.put("email", "sri@jlc.com");
		mp.put("phone", "65799999");
		mp.put("add", "Mathikere");
		Set st = mp.entrySet();
		Iterator it = st.iterator();
		while(it.hasNext())
			System.out.println(it.next());			/*add=Mathikere
													  email=sri@jlc.com
													  name=Sri
													  phone=65799999
													  sid=JLC-99	*/

	}

}
