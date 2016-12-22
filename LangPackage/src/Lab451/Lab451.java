package Lab451;

public class Lab451 {

	public static void main(String[] args) {
		Student st1 = new Student(99,"Sri");
		Student st2 = new Student(99,"Sri");
		Student st3 = new Student(88,"Manish");
		Student st4 = st1;
		
		System.out.println("using == op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);
		
		System.out.println("using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));

	}

}
