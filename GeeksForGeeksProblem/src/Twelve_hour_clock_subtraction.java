import java.util.Scanner;

public class Twelve_hour_clock_subtraction {

	public static void main(String[] args) {
		int test,num1,num2;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of test cases: ");
		test = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<test;i++){
			System.out.println("Enter the two num with separate by <space>: <= 12 only: ");
			str = sc.nextLine();
			String[] st = str.split(" ");
			num1 = Integer.parseInt(st[0]);
			num2 = Integer.parseInt(st[1]);
			Twelve_hour_clock_subtraction thcs = new Twelve_hour_clock_subtraction();
			thcs.clock_subtraction(num1, num2);
		}
		
	}
	void clock_subtraction(int n1,int n2){
		int a;
		if(n1<=12 && n2<=12){
			if(n1>n2)
				a = n1-n2;
			else 
				a = n2-n1;
			
			System.out.println(a);
		}
		else
			System.out.println("Invalid input");
	}
}