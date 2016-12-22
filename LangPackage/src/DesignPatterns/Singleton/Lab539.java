package DesignPatterns.Singleton;

public class Lab539 {

	public static void main(String[] args) {
		Hello2 h1 = Hello2.getHello2();
		System.out.println(h1);							//Hello1@19e0bfd
		System.out.println(Hello2.getHello2());			//Hello1@19e0bfd
		System.out.println(Hello2.getHello2());			//Hello1@19e0bfd

	}

}
class Hello2{
	private static Hello2 INS = null;
	static{
		INS = new Hello2();
	}
	private Hello2(){
		
	}
	public static Hello2 getHello2() {
		if(INS==null)
			INS = new Hello2();
		return INS;
	}
}