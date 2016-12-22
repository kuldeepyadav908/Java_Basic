/*WAP to find the sum of first N odd numbers?*/
import java.util.Scanner;

public class Sum_of_first_N_odd_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N:");
		int n = sc.nextInt();
		int sum = 0;
		if(n>=1){
			for(int i=1;i<=n;i++){
				if(i%2 != 0){
					sum += i;
				}
			}
		}
		System.out.println("Sum of "+n+" odd number is: "+sum);
	}

}
