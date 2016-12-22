/*WAP to find the reverse of a given number?*/
import java.util.Scanner;

public class Reverse_of_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int reverse = 0;
		while(n != 0){
			int rem = n%10;
			reverse = reverse*10 + rem;
			n = n/10;
		}
		System.out.println("Reverse of number is: "+reverse);
	}

}
