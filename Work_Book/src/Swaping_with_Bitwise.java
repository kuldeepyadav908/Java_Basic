/*How to Swap two numbers with using bitwise operators*/

import java.util.Scanner;

public class Swaping_with_Bitwise {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swaping "+a+" and "+b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("After Swaping "+a+" and "+b);

	}

}
