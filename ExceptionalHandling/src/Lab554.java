
public class Lab554 {

	public static void main(String[] args) {
		System.out.println("Main Started");				//Main Started
		try{
			int res = 10/0;								//java.lang.ArithmeticException
			System.out.println("Result is: "+res);
		}catch(NumberFormatException e){
			System.out.println("*Invalid input");
		}
		System.out.println("Main Completed");

	}

}
