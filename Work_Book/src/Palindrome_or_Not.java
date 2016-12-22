/*WAP to find whether the given number is Palindrome or not?*/
import java.util.Scanner;

public class Palindrome_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int original = n;
		int rev = 0;
		while(n != 0){
			int rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		if(original == rev)
			System.out.println("Number is Palindrome: "+original);
		else
			System.out.println("Number is not Palindrome: "+original);

	}

}
