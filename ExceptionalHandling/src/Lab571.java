
public class Lab571 {

	public static void main(String[] args) throws StudentNotFoundException3 {
		System.out.println("Main Started");					//Main Started
		StudentService3 serv = new StudentService3();	
		serv.getNameBySid(null);						//StudentNotFoundException3
		System.out.println("Main Ends");

	}

}
class StudentService3{
	String getNameBySid(String sid) throws StudentNotFoundException3{
		if(sid == null||sid.isEmpty()||sid.equals("JLC-099"))
			throw new StudentNotFoundException3(sid);
		else 
			return "Srinivas";
		}
			
	}
class StudentNotFoundException3 extends Exception{
	public StudentNotFoundException3(String sid) {
		super(sid);
	}
} 