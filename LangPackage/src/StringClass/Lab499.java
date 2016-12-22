package StringClass;

public class Lab499 {

	public static void main(String[] args) {
		String exp = "[A-Z]*";
		System.out.println("S".matches(exp));			//true
		System.out.println("HI".matches(exp));  		//true
		System.out.println("SRINIVAS".matches(exp));	//true
		System.out.println("JLCINDIA".matches(exp));	//true
		System.out.println("jlc".matches(exp));			//false
	}

}
