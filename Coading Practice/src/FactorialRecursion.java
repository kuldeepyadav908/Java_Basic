import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial: ");
		number = sc.nextInt();
		FactorialRecursion fr = new FactorialRecursion();
		System.out.println("Factorial : "+fr.factorial(number));
		
	}
	public int factorial(int n){
		int output;
		if(n==1){
			return 1;
		}
		output = factorial(n-1)*n;
		return output;
	}

}
