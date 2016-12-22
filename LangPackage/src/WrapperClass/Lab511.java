package WrapperClass;

public class Lab511 {

	public static void main(String[] args) {
		Character cref = new Character('A');
		char ch = cref.charValue();
		System.out.println(ch);							//A
		Boolean b1 = new Boolean(false);
		boolean bol = b1.booleanValue();				
		System.out.println(bol);						////false
		Float f1 = new Float(300.3434);
		System.out.println(f1);							//300.3434
		byte by1 = f1.byteValue();
		System.out.println(by1);						//44
		short sh = f1.shortValue();
		System.out.println(sh);							//300
		int in = f1.intValue();
		System.out.println(in);							//300
		long l = f1.longValue();
		System.out.println(l);							//300
		float f = f1.floatValue();
		System.out.println(f);							//300.3434
		double d = f1.doubleValue();
		System.out.println(d);							//300.3434143066406

	}

}
