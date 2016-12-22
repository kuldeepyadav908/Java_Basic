import java.util.Scanner;

public class One_D_Array {

	public static void main(String[] args) {
		System.out.println("Enter the Total No of Elements");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the total values");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Accessing the values");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
