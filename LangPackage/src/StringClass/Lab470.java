package StringClass;

public class Lab470 {

	public static void main(String[] args) {
		System.out.println("ABC".compareTo("ABC"));				//0
		System.out.println("ABC".compareTo("ADO"));				//-2
		System.out.println("ABC".compareTo("ABCDEFG"));			//-4
		System.out.println("ABCDEFG".compareTo("ABC"));			//4
		System.out.println("ABC".compareTo("DEF"));				//-3
		System.out.println("ABC".compareTo("abc"));				//-32
		System.out.println("ABC".compareToIgnoreCase("abc"));	//0

	}

}
