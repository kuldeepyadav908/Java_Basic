import java.util.Scanner;

public class Twelve_hour_clock_Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Test Cases? ");
		int test = sc.nextInt();
		int i;
		int arr[] = new int[test*2];
		
		for(int j=0;j<test;j++){
			for(i=0;i<2;i++){
				System.out.println("Enter the positive numbers: ");
				arr[i] = sc.nextInt();
			}
			int hr = arr[0]*arr[1];
			int clk = hr%12;
			System.out.println(clk);
		}
	}

}
