package AutoBoxing;

public class Lab516 {

	public static void main(String[] args) {
		Integer in1 = 127;
		Integer in2 = 127;
		System.out.println(in1 == in2);			//true
		Integer in3 = 128;
		Integer in4 = 128;
		System.out.println(in3 == in4);			//false
	}

}
