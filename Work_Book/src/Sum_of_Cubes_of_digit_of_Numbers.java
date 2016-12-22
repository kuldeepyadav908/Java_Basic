/*WAP to display sum of Cubes of individual digits of given number? */
import java.util.Scanner;

public class Sum_of_Cubes_of_digit_of_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0){
			int digit = n%10;
			sum += (digit*digit*digit);
			n = n/10;
		}
		System.out.println("Sum of Cubes of Digit of "+n+" is: "+sum);

	}

}
