/*WAP to display sum of factorials of individual digits of given numbers? */
import java.util.Scanner;

public class Sum_of_factorials_of_digit_of_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial:");
		int n = sc.nextInt();
		int factsum = 0;
		while(n != 0){
			long fact = 1;
			int digit = n%10;
			for(int i=1;i<=digit;i++){
				fact *= i;
			}
			factsum += fact;
			n = n/10;	
		}
		System.out.println("Sum of factorial of digits is: "+factsum);
	}

}
