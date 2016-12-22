/*WAP to display sum of Squares of individual digits of given number? */
import java.util.Scanner;

public class Sum_of_Squares_of_digit_of_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0){
			int digit = n%10;
			sum += digit*digit;
			n = n/10;
		}
		System.out.println("Sum of Squares of Digit of "+n+" is: "+sum);
	}

}
