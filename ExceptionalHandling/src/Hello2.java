
public class Hello2 {

	public static void main(String[] args) {
		System.out.println("**Main Started**");
		Hello2 h = new Hello2();
		Object obj = h.clone();					/*unreported Exception
												  CloneNotSupportedException;
												  must be caught or declared to be thrown
												  */
		System.out.println("Main Completed");

	}

}
