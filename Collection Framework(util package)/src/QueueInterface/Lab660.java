package QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab660 {

	public static void main(String[] args) {
		Queue<String> que = new PriorityQueue<String>();
		que.add("Srinivas");
		que.add("Manish");
		que.add("Kumar");
		que.add("Srinivas");
		que.add("Ranjan");
		int len = que.size();
		for(int i = 0;i<len;i++){
			System.out.println(que.poll());			/*Kumar
													  Manish
													  Ranjan
													  Srinivas
													  Srinivas	*/
		}
		System.out.println("\n******");				//******
		Queue<String> que1 = new PriorityQueue<String>(new PSort());
		que1.add("Srinivas");
		que1.add("Manish");
		que1.add("Kumar");
		que1.add("Srinivas");
		que1.add("Ranjan");
		int len1 = que1.size();
		for(int i = 0;i<len1;i++){
			System.out.println(que1.poll());		/*Srinivas
													  Srinivas
													  Ranjan
													  Manish
													  Kumar	*/
		}
	}

}
class PSort implements Comparator<String>{
	public int compare(String st1, String st2) {
		
		return st2.compareTo(st1); 
	}
}