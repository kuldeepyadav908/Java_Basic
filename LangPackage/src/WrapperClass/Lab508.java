package WrapperClass;

public class Lab508 {

	public static void main(String[] args) {
		int a = 123;
		//String st1 = a;					//	INVALID
		//String st2 = (String)a;			//	INVALID
		String st3 = ""+a;
		String st4 = a+"";
		System.out.println(st3);			//123
		System.out.println(st4);			//123
		String st5 = String.valueOf(a);
		System.out.println(st5);			//123
		String st6 = Integer.toString(a);
		System.out.println(st6);			//123

	}

}
