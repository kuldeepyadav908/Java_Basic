
public class Lab568 {

	public static void main(String[] args) {
		String nm = "";
		try{
			StudentService serv = new StudentService();
			//nm = serv.getNameBySid(null);					//java.lang.NullPointerException
			//nm = serv.getNameBySid("");					//EmptySidException
			//nm = serv.getNameBySid("JLC-088");			//StudentNotFoundException: JLC-088
			nm = serv.getNameBySid("JLC-099");
			System.out.println("Name: "+nm);				//Name: Srinivas
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
class EmptySidException extends RuntimeException{
	
}
class StudentService{
	String getNameBySid(String sid){
		if(sid == null)
			throw new NullPointerException();
		else if(sid.isEmpty())
			throw new EmptySidException();
		else if(sid.equals("JLC-099"))
			return "Srinivas";
		else
			throw new StudentNotFoundException(sid);
	}
}
class StudentNotFoundException extends RuntimeException{
	public StudentNotFoundException(String sid) {
		super(sid);
	}
}