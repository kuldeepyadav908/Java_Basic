
public class Lab560 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		new Hellos1().show("0");
		System.out.println("Main() Completed");

	}

}
class Hellos1{
	void show(String str){
		System.out.println("show() called");
		try{
			System.out.println("try block started");
			int a = Integer.parseInt(str);
			int b = 10/a;
			System.out.println("try block completed:"+b);
			//System.exit(0);
		}catch(ArithmeticException e){
			System.out.println("catch block");
			System.exit(0);
		}finally {
			System.out.println("finally block");
		}
		
	}
}


/*
Main() Started
show() called
try block started
catch block
 */