package EnumClass;

import java.util.*;

public class Lab715 {

	public static void main(String[] args) {
		Set<Direction4> set = EnumSet.allOf(Direction4.class);
		System.out.println(set);					//[EAST, NORTH, WEST, SOUTH]
		Map<Direction4,Integer> map = new EnumMap<Direction4,Integer>(Direction4.class);
		map.put(Direction4.EAST,0);
		map.put(Direction4.NORTH,90);
		map.put(Direction4.WEST,180);
		map.put(Direction4.SOUTH,270);
		System.out.println(map);					//{EAST=0, NORTH=90, WEST=180, SOUTH=270}
		
	}

}
enum Direction4{
	EAST,NORTH,WEST,SOUTH
}