/*WAP to find the sum of even digits and sum of odd digits available
 * in given number? */
import java.util.Scanner;

public class Sum_of_even_odd_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int esum = 0,osum = 0;
		while(n != 0){
			int digit = n%10;
			if(digit%2 == 0)
				esum += digit;
			else
				osum += digit;
			n = n/10;
		}
		System.out.println("Sum of Even digit of number is: "+esum);
		System.out.println("Sum of Odd digit of number is: "+osum);
	}

}
