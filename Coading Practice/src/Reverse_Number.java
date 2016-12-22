import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int num,rem,rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		num = sc.nextInt();
		while(num != 0){
			rem = num % 10;
			rev = rev*10 + rem;
			num = num/10;
		}
		 System.out.println("Reverse is: "+rev);

	}

}
