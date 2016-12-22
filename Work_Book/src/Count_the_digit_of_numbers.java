/*WAP to display number of digits available in given number?*/
import java.util.Scanner;

public class Count_the_digit_of_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int count = 0;
		while(n != 0){
			int digit = n%10;
			System.out.print(digit+" ");
			count++;
			n = n/10;
		}
		System.out.println("\nNo. of digit is: "+count);
	}

}
