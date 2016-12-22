
public class Lab557 {

	public static void main(String[] args) {
		System.out.println("Main Started");				//Main Started
		try{
			int res = 10/3;
			System.out.println("Result is: "+res);		//Result is: 3
			return;
		}catch(Exception e){
			System.out.println("*Invalid input");
		}finally {
			System.out.println("Main Completed");		//Main Completed
		}
	}

}
