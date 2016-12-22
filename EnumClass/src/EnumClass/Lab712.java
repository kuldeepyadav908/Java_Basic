package EnumClass;

public class Lab712 {

	public static void main(String[] args) {
		Direction1 arr[] = Direction1.values();
		for(Direction1 d:arr){
			System.out.println(d.ordinal()+"\t"+d.name());				/*0		EAST
																		  1		NORTH
																		  2		WEST
																		  3		SOUTH 	(6) */
		}
		try{
			Direction1 d = Direction1.valueOf("east");
			System.out.println("**Direction1 found with the Name");
		}
		catch(IllegalArgumentException ex){
			System.out.println("**No Direction1 found with the Name");	//**No Direction1 found with the Name		(7)
		}
		Direction1 d = Direction1.valueOf("EAST");
		System.out.println("*******");									//*******			(8)
		System.out.println(d);											//EAST				(9)

	}

}
enum Direction1{
	EAST(0),NORTH(90),WEST(180),SOUTH(270);
	int angle;
	private Direction1(int angle) {
		this.angle = angle;
		System.out.println("Direction1() Def cons**");		/*Direction1() Def cons**	(1)
															  Direction1() Def cons**	(2)
															  Direction1() Def cons**	(3)
															  Direction1() Def cons**	(4)	*/
	}
	static{
		System.out.println("**static Block in Direction class\n");		//**static Block in Direction class		(5)
	}
}