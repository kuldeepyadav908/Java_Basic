/* Write a program to read two numbers and display its remainder without
 * using % Operators */
import java.util.Scanner;

public class Remainder_without_using_modulus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int rem = a-(a/b)*b;
		System.out.println("Remainder = "+rem);
	}

}
