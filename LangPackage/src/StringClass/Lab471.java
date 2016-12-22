package StringClass;

public class Lab471 {

	public static void main(String[] args) {
		int ab = 98;
		String st1 = ab;					//Type Mismatch
		String st2 = (String)ab;			//can not cast int to String
		System.out.println(st1+"\t"+st2);	
	}

}
