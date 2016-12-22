
public class Lab559 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		new Hellos().show("3");
		System.out.println("Main() Completed");

	}

}
class Hellos{
	void show(String str){
		System.out.println("show() called");
		try{
			System.out.println("try block started");
			int a = Integer.parseInt(str);
			int b = 10/a;
			System.out.println("try block completed:"+b);
			System.exit(0);
		}catch(ArithmeticException e){
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		
	}
}
/*
Main() Started
show() called
try block started
try block completed:3 */