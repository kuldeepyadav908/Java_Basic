package StringClass;

public class Lab498 {

	public static void main(String[] args) {
		String exp ="[A-Z]";
		System.out.println("H".matches(exp));		//true
		System.out.println("S".matches(exp));		//true
		System.out.println("HI".matches(exp));		//false

	}

}
