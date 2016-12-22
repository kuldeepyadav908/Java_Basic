package WrapperClass;

public class Lab512 {

	public static void main(String[] args) {
		String str = "12345";
		Integer in = new Integer(str);
		System.out.println(in);									//12345
		String s2 = "123";
		Byte by = new Byte(s2);
		System.out.println(by);									//123
		Boolean bl = new Boolean("TrUe");
		System.out.println(bl);									//true
		Boolean bl1 = new Boolean("JLC");
		System.out.println(bl1);								//false
		//Integer in2 = new Integer("12.0");					//NPE
		String st = "A";
		Character ch = new Character(st.charAt(0));
		System.out.println(ch);
	}

}
