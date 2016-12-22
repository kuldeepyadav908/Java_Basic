import java.util.Scanner;

public class Sum_series {

	public static void main(String[] args) {
		double sum = 0;
		int n;
		System.out.println("1/1!+2/2!+3/3!+.....N/N!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms of series");
		n = sc.nextInt();
		Sum_series ss = new Sum_series();
		for(int i=1;i<=n;i++){
			sum = sum + (double)i / (ss.fact(i));
		}
		System.out.println("sum of Series: "+sum);
	}
	int fact(int x){
		int mul = 1;
		while(x>0){
			mul = mul*x;
			x--;
		}
		return mul;
	}

}
