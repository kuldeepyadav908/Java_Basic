/*Write a program to print first N natural numbers? */
import java.util.Scanner;

public class First_N_natural_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N: ");
		int n = sc.nextInt();
		if(n>=1){
			for(int i=1;i<=n;i++){
				System.out.print(i+" ");
			}
		}
	}

}
