package StringClass;

public class Lab503 {

	public static void main(String[] args) {
		String st1 = "Website is www.jlcindia.com";
		String st2  = "info@jlcindia.com is id to send email";
		boolean b1 = st1.regionMatches(2, st2, 5, 10);
		System.out.println(b1);									//false
		boolean b2 = st1.regionMatches(15, st2, 5, 9);
		System.out.println(b2);									//true
		boolean b3 = st1.regionMatches(15, st2, 5, 12);
		System.out.println(b3);									//true
		boolean b4 = st1.regionMatches(15, st2, 5, 13);
		System.out.println(b4);									//false
		
		String st3 = "INFO@JLCINDIA.COM is id to send email";
		boolean b5 = st1.regionMatches(15, st3, 5, 12);
		System.out.println(b5);									//false
		boolean b6 = st1.regionMatches(false,15, st3, 5, 12);
		System.out.println(b6);									//false
		boolean b7 = st1.regionMatches(true,15, st3, 5, 12);
		System.out.println(b7);									//true
		
	}
}
