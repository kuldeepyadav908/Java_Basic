package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab646 {

	public static void main(String[] args) {
		System.out.println("***LinkedHashMap***");		//***LinkedHashMap***
		Map mp = new LinkedHashMap();
		mp.put("Sid", "JLC-99");
		mp.put("Name", "Sri");
		mp.put("email", "sri@jlc.com");
		mp.put("phone", "65799999");
		mp.put("add", "Mathikere");
		Set st = mp.entrySet();
		Iterator it = st.iterator();
		while(it.hasNext())
			System.out.println(it.next());				/*Sid=JLC-99
														  Name=Sri
														  email=sri@jlc.com
														  phone=65799999
														  add=Mathikere	*/

	}

}
