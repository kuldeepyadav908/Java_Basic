/*WAP to find the sum of individual digits of given numbers?*/
import java.util.Scanner;

public class Sum_of_individual_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0){
			int digit = n%10;
			sum = sum+digit;
			n = n/10;
		}
		System.out.println("Sum of the individual Digits is: "+sum);
	}

}
