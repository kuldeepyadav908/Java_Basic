import java.util.Scanner;

public class FibonacciSeries_1 {

	public static void main(String[] args) {
		int limit;
		int Start = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the max range of the Fibonacci series");
		limit = sc.nextInt();
		
		long[] series = new long[limit];
		series[0] = 0;
		series[1] = 1;
		
		for(int i = 2;i<limit;i++){
			series[i] = series[i-1] + series[i-2];
		}
		System.out.println("Fibonacci series upto limit: "+limit);
		for(int i = 0; i<limit ; i++){
			System.out.println(series[i]+" ");
		}

	}

}
