package StringClass;

public class Lab480 {

	public static void main(String[] args) {
		String str = "Hai,Welcome to JLC";
		System.out.println(str.endsWith("Hai"));		//false
		System.out.println(str.endsWith("Welcome"));	//false
		System.out.println();
		System.out.println(str.startsWith(""));			//true
		System.out.println(str.endsWith(""));			//true
	}

}
