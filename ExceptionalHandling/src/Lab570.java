
public class Lab570 {

	public static void main(String[] args) {
		System.out.println("Main Started");					//Main Started
		try{
			StudentService2 serv = new StudentService2();	
			serv.getNameBySid(null);						//StudentNotFoundException2
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Main Ends");					//Main Ends

	}

}
class StudentService2{
	String getNameBySid(String sid) throws StudentNotFoundException2{
		if(sid == null||sid.isEmpty()||sid.equals("JLC-099"))
			throw new StudentNotFoundException2(sid);
		else 
			return "Srinivas";
		}
			
	}
class StudentNotFoundException2 extends Exception{
	public StudentNotFoundException2(String sid) {
		super(sid);
	}
}