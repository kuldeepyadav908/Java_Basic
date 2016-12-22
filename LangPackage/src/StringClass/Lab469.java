package StringClass;

public class Lab469 {

	public static void main(String[] args) {
		String st1 = new String("JLC");
		String st2 = new String("JLC");
		String st3 = new String("jlc");
		System.out.println(st1+"\t"+st2+"\t"+st3);			//JLC	JLC	 jlc
		System.out.println(st1==st2);						//false
		System.out.println(st1==st3);						//false
		System.out.println();
		System.out.println(st1.equals(st2));				//true
		System.out.println(st1.equals(st3));				//false
		System.out.println(st1.equalsIgnoreCase(st3));		//true
	}

}
