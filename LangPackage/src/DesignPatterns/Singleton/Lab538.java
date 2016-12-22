package DesignPatterns.Singleton;

public class Lab538 {

	public static void main(String[] args) {
		Hello1 h1 = Hello1.getHello1();
		System.out.println(h1);							//Hello1@19e0bfd
		System.out.println(Hello1.getHello1());			//Hello1@19e0bfd
		System.out.println(Hello1.getHello1());			//Hello1@19e0bfd

	}

}
class Hello1{
	private static Hello1 INS = null;
	static{
		INS = new Hello1();
	}
	private Hello1(){
		
	}
	public static Hello1 getHello1() {
		return INS;
	}
}