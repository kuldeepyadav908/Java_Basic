package QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab657 {

	public static void main(String[] args) {
		Queue<Stud> que = new PriorityQueue<Stud>();
		que.add(new Stud());
		que.add(new Stud());
		System.out.println("Main Completed");			//java.lang.ClassCastException
		
	}

}
class Stud{
	
}