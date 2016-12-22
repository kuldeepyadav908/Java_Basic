package Generics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lab652 {

	public static void main(String[] args) {
		ArrayList<String> email = new ArrayList<String>();
		email.add("sri@jlc.com");
		//email.add("dk@jlc.com");
		//email.add("mk@jlc.com");
		
		ArrayList<Long> phone = new ArrayList<Long>();
		phone.add(555555l);
		//phone.add(666666l);
		//phone.add(777777l);
		
		LinkedHashMap<String, Long> ref = new LinkedHashMap<String, Long>();
		ref.put("Dande", 111111L);
		//ref.put("Kumar", 222222L);
		//ref.put("Ranjan", 333333L);
		
		Student stu = new Student(99, "Srinivas",email, phone, ref );
		//Student stu1 = new Student(910, "Dande", email, phone, ref);
		//Student stu2 = new Student(76, "Manish", email, phone, ref);
		
		ArrayList<Student> stLst = new ArrayList<Student>();
		stLst.add(stu);
		//stLst.add(stu1);
		//stLst.add(stu2);
		//stLst.add(stu);
		
		System.out.println(stLst);
		
		
	}

}
class Student{
	int sid;
	String name;
	List<String> email;
	List<Long> phone;
	Map<String,Long> ref;
	
	public Student(int sid,String name,List<String> email,List<Long> phone,Map<String,Long> ref) {
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.ref = ref;
	}
	public String toString() {
		
		return "\n"+sid+"\t"+name+"\n"+email+"\n"+phone+"\n"+ref+"\n";
	}
}
