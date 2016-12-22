package Lab445;

public class Employee {
	int eid;
	long phone;
	Employee(int sid,long phone){
		this.eid = eid;
		this.phone = phone;
	}
	public int hashCode(){
		return (int)(phone|eid);
		//return 10;
	}
}
