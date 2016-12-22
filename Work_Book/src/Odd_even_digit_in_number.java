/*WAP to display number of even and odd digits available in the numbers?*/
import java.util.Scanner;

public class Odd_even_digit_in_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		int even = 0,odd = 0;
		while(n != 0){
			int dig = n%10;
				if(dig%2==0)
					even++;
				else
					odd++;
			n = n/10;
		}
		System.out.print("Even no's in the number: "+even);
		System.out.println("\nOdd no's in the number: "+odd);
	}

}
