/*How to swap two numbers without using temporary variables*/

import java.util.Scanner;

public class Swaping {
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a and b value:");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before swaping "+a+" and "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swaping "+a+" and "+b);

	}

}
