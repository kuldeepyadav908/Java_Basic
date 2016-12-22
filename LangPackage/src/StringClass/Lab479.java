package StringClass;

public class Lab479 {

	public static void main(String[] args) {
		String str = "Hai,Welcome to JLC";
		System.out.println(str.startsWith("Hai"));			//true
		System.out.println(str.startsWith("Welcome"));		//false
		System.out.println(str.startsWith("Welcome",5));	//false
		System.out.println(str.startsWith("Welcome",4));	//true
	}

}
