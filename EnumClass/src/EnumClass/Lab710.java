package EnumClass;

public class Lab710 {

	public static void main(String[] args) {
		Direction d1 = null;
		//d1 = new Direction("EAST",0);
		d1 = Direction.EAST;
		System.out.println(d1);						//EAST		0			(6)
		System.out.println(Direction.NORTH);		//NORTH		90			(7)
		System.out.println(Direction.WEST);			//WEST		180			(8)
		System.out.println(Direction.SOUTH);		//SOUTH		270			(9)
	}

}
class Direction{
	public static Direction EAST = new Direction("EAST",0);
	public static Direction NORTH = new Direction("NORTH",90);
	public static Direction WEST = new Direction("WEST",180);
	public static Direction SOUTH = new Direction("SOUTH",270);
	static{
		System.out.println("**Static Block in Direction class\n");		//**Static Block in Direction class		(5)
	}
	private String name;
	private int angle;
	public Direction(String name,int angle) {
		this.name = name;
		this.angle = angle;
		System.out.println("Direction(String,int)Cons");		/*Direction(String,int)Cons		(1)
																  Direction(String,int)Cons		(2)
																  Direction(String,int)Cons		(3)
																  Direction(String,int)Cons		(4)	*/
	}
	/*public int getAngle() {
		return this.angle;
	}*/
	public String toString() {
		
		return name+"\t\t"+angle;
	}
}