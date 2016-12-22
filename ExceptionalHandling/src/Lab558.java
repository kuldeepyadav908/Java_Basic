
public class Lab558 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		int r = new Hello().show();
		System.out.println("main: "+r);
		System.out.println("Main() completed");
	}

}
class Hello{
	int show(){
		int a = 0;
		try{
			System.out.println("try block begins: "+a);
			a = 10/4;
			System.out.println("try block ends: "+a);
			return a;
		}catch(ArithmeticException e){
			a =20;
			System.out.println("catch block: "+a);
			return a;
		}finally{
			System.out.println("finally block: "+a);
			int arr[] = new int[-1];
		}
	}
}


/*
Main() Started
try block begins: 0
try block ends: 2
finally block: 2 
java.lang.NegativeArraySizeException
*/