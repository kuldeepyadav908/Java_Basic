
public class Lab569 {

	public static void main(String[] args) {
		System.out.println("Main Started");					//Main Started
		try{
			StudentService1 serv = new StudentService1();
			serv.getNameBySid(null);						//StudentNotFoundException
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Main Ends");					//Main Ends
	}

}
class StudentService1{
	String getNameBySid(String sid){
		if(sid == null||sid.isEmpty()||sid.equals("JLC-099"))
			throw new StudentNotFoundException1(sid);
		else 
			return "Srinivas";
		}
			
	}

class StudentNotFoundException1 extends RuntimeException{
	public StudentNotFoundException1(String sid) {
		super(sid);
	}
}