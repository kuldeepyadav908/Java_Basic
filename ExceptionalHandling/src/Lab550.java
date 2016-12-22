
public class Lab550 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			int res = 10/0;
			System.out.println("result is: "+res);
		}
		System.out.println("JLC");
		catch(NumberFormatException e){
			System.out.println("*Invalid input");
		}
		System.out.println("Main Completed");

	}

}
