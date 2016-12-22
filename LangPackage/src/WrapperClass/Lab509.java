package WrapperClass;

public class Lab509 {

	public static void main(String[] args) {
		String str = "99";
		int a = Integer.parseInt(str);
		System.out.println(a);							//99
		byte b = Byte.parseByte("88");
		System.out.println(b);							//88
		String s1 = "A";
		char ch = s1.charAt(0);
		System.out.println(ch);							//A
		
		//byte b2 = Byte.parseByte("129");				//NPE
		//int x = Integer.parseInt("989898089098");		//NPE
		//int y = Integer.parseInt("123.0");			//NPE

	}

}
