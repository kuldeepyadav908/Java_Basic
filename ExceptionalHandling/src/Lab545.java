
public class Lab545 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try{
			String str = args[0];						//AIOBE
			int x = Integer.parseInt(str);				//NFE
			int res = 10/x;								//AE
			System.out.println("Result is: "+res);
		}
		catch(Exception e){
			System.out.println("*Enter correct value");
		}
		System.out.println("Main Completed");

	}

}
