import java.util.Scanner;

public class Calculate_the_Median {

	public static void main(String[] args) {
		float sum = 0,a;
		System.out.println("How many perform testing cases:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		float print[] = new float[x];
		for(int i=0;i<x;i++){
			sum = 0;
			System.out.println("Enter the number of Subject");
			int sub = sc.nextInt();
			System.out.println("Enter the marks obtained");
			int arr[] = new int[sub];
			
			for(int j=0;j<arr.length;j++){
				arr[j] = sc.nextInt();
				sum = sum + arr[j];
				
			}
			System.out.println(sum);
			float med = sum/sub; 
				System.out.println("Median: "+med);
				
		}
	}
}
