package EnumClass;

public class Lab711 {

	public static void main(String[] args) {
		Directions d1 = null;
		//d1 = new Direction("EAST",0);
		d1 = Directions.EAST;
		System.out.println(d1);						//EAST			
		System.out.println(Directions.NORTH);		//NORTH
		System.out.println(Directions.WEST);		//WEST	
		System.out.println(Directions.SOUTH); 		//SOUTH

	}

}
enum Directions{
	EAST,NORTH,WEST,SOUTH;
	private Directions() {
		System.out.println("Directions() Def Cons**");		/*Directions() Def Cons**		1
															  Directions() Def Cons**		2
															  Directions() Def Cons**		3
															  Directions() Def Cons**		4	*/
	}
	static{
		System.out.println("**Static Block in Directions class");	//**Static Block in Directions class
	}
}