/*WAP to print first N odd numbers.*/
import java.util.Scanner;

public class N_odd_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int n = sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++){
				if(i%2 != 0)
					System.out.print(i+" ");
			}
		}
		
	}
}
