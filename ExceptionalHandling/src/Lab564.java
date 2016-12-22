
public class Lab564 {

	public static void main(String[] args) {
		Exception e1 = new ClassCastException();
		Exception e2 = new NullPointerException();
		Exception e3 = new CloneNotSupportedException();
		System.out.println(e1 instanceof RuntimeException);			//true
		System.out.println(e2 instanceof RuntimeException);			//true
		System.out.println(e3 instanceof RuntimeException);			//false
	}

}
