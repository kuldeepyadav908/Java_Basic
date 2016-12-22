package Map;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Set;

public class Lab645 {

	public static void main(String[] args) {
		System.out.println("***HashMap***");		//***HashMap***
		Map mp = new HashMap();
		mp.put("Sid", "JLC-99");
		mp.put("Name", "Sri");
		mp.put("email", "sri@jlc.com");
		mp.put("phone", "65799999");
		mp.put("add", "Mathikere");
		Set st = mp.entrySet();
		Iterator it = st.iterator();
		while(it.hasNext())
			System.out.println(it.next());			/*add=Mathikere
													  phone=65799999
													  email=sri@jlc.com
													  Sid=JLC-99
													  Name=Sri	*/
	}

}
