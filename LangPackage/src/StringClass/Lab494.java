package StringClass;

public class Lab494 {

	public static void main(String[] args) {
		char carr[] = {'J','L','C','I','N','D','I','A'};
		byte barr[] = {65,66,67,97,89,99,49,50};
		String st1 = new String(carr,3,5);
		String st2 = new String(barr,3,5);
		System.out.println("st1: "+st1);			//st1: INDIA
		System.out.println("st2: "+st2);			//st2: aYc12
	}

}
