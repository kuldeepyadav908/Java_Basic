/*WAP to find the sum of first N natural numbers?*/
import java.util.Scanner;

public class Sum_of_fst_N_natural_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of N: ");
		int n = sc.nextInt();
		int sum = 0;
		if(n>=1){
			for(int i=1;i<=n;i++){
				sum = sum+i;
			}
		}
		System.out.println("Sum of First N natural number is: "+sum);
	}

}
