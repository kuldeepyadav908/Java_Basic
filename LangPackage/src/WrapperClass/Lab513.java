package WrapperClass;

public class Lab513 {

	public static void main(String[] args) {
		Integer in = new Integer(1234);
		String s1 = in.toString();
		System.out.println(s1);						//1234
		Boolean b = new Boolean("JLC");
		System.out.println(b);						//false
		String s2 = b.toString();
		System.out.println(s2);						//false
		//Character ch = new Character("A");
		//String st3 = ch.toString();

	}

}
