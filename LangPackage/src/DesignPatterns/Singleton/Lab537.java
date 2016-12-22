package DesignPatterns.Singleton;


public class Lab537 {

	public static void main(String[] args) {
		Hello h = Hello.getHello();
		System.out.println(h);						//Hello@19e0bfd
		System.out.println(Hello.getHello());		//Hello@19e0bfd
		System.out.println(Hello.getHello());		//Hello@19e0bfd
		//h.clone();
	}

}
class Hello{
	private static Hello INS = new Hello();
	private Hello(){}
	public static Hello getHello() {
		return INS;
	}
	
}