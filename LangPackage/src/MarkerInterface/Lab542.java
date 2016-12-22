package MarkerInterface;

public class Lab542 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student st = new Student(99);
		System.out.println(st.sid);
		Student st1 = st.myclone();
		System.out.println(st1.sid);
		System.out.println(st==st1);

	}

}
interface JLCCloneable{}

class Student implements JLCCloneable{
	int sid;
	public Student(int sid) {
		this.sid = sid;
	}
	public Student myclone() throws CloneNotSupportedException{
		if(this instanceof JLCCloneable){
			return new Student(sid);
		}
		else
			throw new CloneNotSupportedException("Implement JLCCloneable");
	}
}