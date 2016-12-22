/*WAP to read a number and display in word
 * input - 23456
 * output-Two Three Four Five Six */
import java.util.Scanner;

public class Number_display_in_Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		String msg = "";
		while(n != 0){
			int rem = n%10;
			switch(rem){
			case 0: msg = "Zero "+msg; break;
			case 1: msg = "One "+msg; break;
			case 2: msg = "Two "+msg; break;
			case 3: msg = "Three "+msg; break;
			case 4: msg = "Four "+msg; break;
			case 5: msg = "Five "+msg; break;
			case 6: msg = "Six "+msg; break;
			case 7: msg = "Seven "+msg; break;
			case 8: msg = "Eight "+msg; break;
			case 9: msg = "Nine "+msg; break;
			}
			n = n/10;
		}
		System.out.println(msg);
	}

}
