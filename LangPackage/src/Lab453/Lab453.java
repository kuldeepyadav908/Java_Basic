package Lab453;

public class Lab453 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Hai hai = new Hai(10);
		Hello h1 = new Hello(20,hai);
		Hello h2 = (Hello)h1.clone();
		
		System.out.println(h1==h2);
		System.out.println(h1.hai==h2.hai);
		
		h1.show();
		h2.show();
		h2.y = 11;
		h2.hai.x = 22;
		h1.show();
		h2.show();

	}

}
