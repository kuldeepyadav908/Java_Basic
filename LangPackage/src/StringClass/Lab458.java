package StringClass;

public class Lab458 {

	public static void main(String[] args) {
		String str1 = "JLC";
		String str2 = new String("JLC");
		String str3 = new String("JLC");
		System.out.println(str1);				//JLC		
		System.out.println(str2);				//JLC		
		System.out.println(str3);				//JLC		
		System.out.println(str1==str2);			//false	
		System.out.println(str1==str3);			//false
		System.out.println(str2==str3);			//false
	}

}
