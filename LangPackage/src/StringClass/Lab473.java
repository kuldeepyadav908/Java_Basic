package StringClass;

public class Lab473 {

	public static void main(String[] args) {
		Student stu = new Student();
		String st1 = String.valueOf(stu);
		System.out.println(st1);				//StringClass.Student@19e0bfd
		Employee emp = new Employee();
		String st2 = String.valueOf(emp);
		System.out.println(st2); 				//Eid:0

	}

}
class Student{}
class Employee{
	int eid;
	public String toString() {
		return "Eid:"+eid;
	}
}