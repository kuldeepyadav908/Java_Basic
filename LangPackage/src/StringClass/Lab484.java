package StringClass;

public class Lab484 {

	public static void main(String[] args) {
		String str = "Welcome to JLC,Java Training Center,No 1 in Java Training and Placement";
		System.out.println(str.indexOf("Java"));		//15
		System.out.println(str.indexOf("Java",16));		//44
		System.out.println(str.indexOf("Java",17));		//44
	}

}
