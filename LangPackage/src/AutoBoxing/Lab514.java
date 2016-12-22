package AutoBoxing;

public class Lab514 {

	public static void main(String[] args) {
		Byte b1 = 123;
		Byte b2 = 123;
		System.out.println(b1==b2);				//true
		byte b =123;
		Byte by1 = new Byte(b);
		Byte by2 = new Byte(b);
		System.out.println(by1==by2);			//false

	}

}
