/*Write a program to read two numbers and display the sum without using + Operators*/

import java.util.Scanner;

public class Sum_without_plus {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		a = sc.nextInt();
		b = sc.nextInt();
		int carry;
		while(b != 0){
			carry = a&b;
			a = a^b;
			b = carry<<1;
		}
		System.out.println("Sum is "+a);

	}

}
