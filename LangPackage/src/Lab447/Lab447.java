package Lab447;

public class Lab447 {

	public static void main(String[] args) {
		Student st1 = new Student(99,"Sri");
		System.out.println(st1);
		System.out.println("\n***Default Implementation***");
		String cname = st1.getClass().getName();
		int hc = st1.hashCode();
		//System.out.println(hc);
		String hx = Integer.toHexString(hc);
		String msg = cname+"@"+hx;
		System.out.println(msg);
	}

}
