package WrapperClass;

public class Lab510 {

	public static void main(String[] args) {
		int a = 10;
		Integer in = new Integer(a);
		System.out.println(in);						//10
		byte b1 = 123;
		Byte bref = new Byte(b1);
		System.out.println(bref);					//123
		char ch = 'A';
		Character cref = new Character(ch);
		System.out.println(cref);					//A
	}

}
