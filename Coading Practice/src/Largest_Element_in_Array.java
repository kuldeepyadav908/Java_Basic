import java.util.Scanner;

public class Largest_Element_in_Array {

	public static void main(String[] args) {
		System.out.println("Enter the Size of an Array: ");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		System.out.println("Insert the Elements in an Array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Searching the Largest element is...");
		int large = arr[0];
		for(int i=0;i<arr.length;i++){
			if(large < arr[i])
				large = arr[i];
		}
		System.out.println(large);
	}

}
