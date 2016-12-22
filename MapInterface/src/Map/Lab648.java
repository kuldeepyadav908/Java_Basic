package Map;

import java.util.HashMap;
import java.util.Map;

public class Lab648 {

	public static void main(String[] args) {
		Map mp1 = new HashMap();
		mp1.put("Sid", "JLC-99");
		mp1.put("Name", "Srinivas");
		Map mp2 = new HashMap();
		mp2.put("MKR", "Mathikere");
		mp2.put("BTM", "BTM Layout");
		System.out.println(mp1);			//{Sid=JLC-99, Name=Srinivas}
		System.out.println(mp2);			//{MKR=Mathikere, BTM=BTM Layout}
		mp1.putAll(mp2);
		System.out.println(mp1);			//{MKR=Mathikere, BTM=BTM Layout, Sid=JLC-99, Name=Srinivas}
		System.out.println(mp2);			//{MKR=Mathikere, BTM=BTM Layout}
	}
}