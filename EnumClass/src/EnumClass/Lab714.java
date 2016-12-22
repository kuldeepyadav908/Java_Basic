package EnumClass;

public class Lab714 {

	public static void main(String[] args) {
		Direction3.EAST.show();
		Direction3.NORTH.show();
		Direction3.WEST.show();
		Direction3.SOUTH.show();

	}

}
enum Direction3{
	EAST(){
		void show(){
			System.out.println("Showing East Direction");		//Showing East Direction
		}
	},NORTH{
		void show(){
			System.out.println("Showing North Direction");		//Showing North Direction
		}
	},WEST{
		void show(){
			System.out.println("Showing West Direction");		//Showing West Direction
		}
	},SOUTH{
		void show(){
			System.out.println("Showing South Direction");		//Showing South Direction
		}
	};
	abstract void show();
}