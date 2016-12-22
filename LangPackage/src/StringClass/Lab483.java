package StringClass;

public class Lab483 {

	public static void main(String[] args) {
		String str = "Welcome to JLC,Java Training Center,No 1 in Java Training and Placement";
		System.out.println(str.indexOf('J'));				//11
		System.out.println(str.indexOf('J',11));			//11
		System.out.println(str.indexOf('J',12));			//15
		System.out.println(str.indexOf('J',17));			//44
	}

}
