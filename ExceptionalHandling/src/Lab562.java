
public class Lab562 {

	public static void main(String[] args) {
		System.out.println("Main() Started");
		try{
			new Hello1().show();
		}catch(Exception e){
			System.out.println("\ncatch block");
			System.out.println("EX: "+e);
			System.out.println("Message: "+e.getMessage());
			System.out.println("Cause: "+e.getCause());
			System.out.println("******");
			e.printStackTrace();
		}
		System.out.println("Main() Completed");

	}

}
class Hello1{
	void show(){
		System.out.println("show() begins");
		new A().m1();
		System.out.println("show() ends");
	}
}
class A{
	void m1(){
		System.out.println("A->m1() begins");
		new B().m2();
		System.out.println("A->m1() ends");
	}
}
class B{
	void m2(){
		System.out.println("B->m2() begins");
		//int a = 10/0;
		new C().m3();
		System.out.println("B->m2() ends");
	}
}
class C{
	void m3(){
		System.out.println("C->m3() begins");
		//int a = 10/0;
		System.out.println("C->m3() ends");
	}
}


/*
Main() Started
show() begins
A->m1() begins
B->m2() begins
C->m3() begins
C->m3() ends
B->m2() ends
A->m1() ends
show() ends
Main() Completed
*/