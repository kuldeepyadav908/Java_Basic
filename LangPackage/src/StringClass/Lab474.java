package StringClass;

public class Lab474 {

	public static void main(String[] args) {
		Student1 stu = null;
		String st = String.valueOf(stu);
		System.out.println(st);				//null
	}
}
class Student1{}