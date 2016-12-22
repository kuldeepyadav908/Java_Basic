package StringClass;

public class Lab489 {

	public static void main(String[] args) {
		String str ="JLCINDIA";
		int len = str.length();
		System.out.println(str.substring(3,len));		//INDIA
		System.out.println(str.substring(3,len-1));		//INDI
		System.out.println(str.substring(3,len-2));		//IND
	}

}
