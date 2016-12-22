package EnumClass;

public class Lab713 {

	public static void main(String[] args) {
		Direction2 d = Direction2.EAST;
		switch(d){
		case EAST: System.out.println("EAST Direction Selected");		//EAST Direction Selected
		break;
		case NORTH: System.out.println("EAST Direction Selected");
		break;
		case WEST: System.out.println("EAST Direction Selected");
		break;
		case SOUTH: System.out.println("EAST Direction Selected");
		break;
		}

	}

}
enum Direction2{
	EAST,NORTH,WEST,SOUTH
}