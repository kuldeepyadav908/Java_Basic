import java.util.Scanner;

public class Smallest_In_Array {

	public static void main(String[] args) {
		System.out.println("Enter the size of an Array: ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Elements in the Array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int small = arr[0];
		System.out.println("Searching Smallest no. is....");
		for(int i=0;i<arr.length;i++){
			if(small > arr[i])
				small = arr[i];
		}
		System.out.println(small);

	}

}
