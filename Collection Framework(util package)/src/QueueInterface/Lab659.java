package QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab659 {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<String>();
		que.add("Srinivas");
		que.add("Manish");
		que.add("Kumar");
		que.add("Srinivas");
		que.add("Ranjan");
		System.out.println("Size: "+ que.size());			//Size: 5
		System.out.println("Peek: "+ que.peek());			//Peek: Kumar
		System.out.println("Size: "+ que.size());			//Size: 5
		System.out.println("Element: "+ que.element());		//Element: Kumar
		System.out.println("Size: "+ que.size());			//Size: 5
		System.out.println("Poll: "+ que.poll());			//Poll: Kumar
		System.out.println("Size: "+ que.size());			//Size: 4
	}

}
