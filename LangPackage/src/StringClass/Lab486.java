package StringClass;

public class Lab486 {

	public static void main(String[] args) {
		String str = "Welcome to JLC,Java Training Center,No 1 in Java Training and Placement";
		System.out.println(str.lastIndexOf("Java"));		//44
		System.out.println(str.lastIndexOf("Java",43));		//44
		System.out.println(str.lastIndexOf("Java",45));		//44

	}

}
