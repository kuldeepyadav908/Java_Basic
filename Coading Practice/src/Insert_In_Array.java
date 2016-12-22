import java.util.Arrays;
import java.util.Scanner;

public class Insert_In_Array {

	public static void main(String[] args) {
		int []arr = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of an Array: ");
		int size = sc.nextInt();
		
		System.out.println("Enter the Elements");
		for(int i = 0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Insert the element: ");
		int insert = sc.nextInt();
		System.out.println("At which position? (insert the element)");
		int position = sc.nextInt();
		for(int i=size;i>position;i--){
			arr[i] = arr[i-1];
		}
		arr[position] = insert;
		System.out.println("Inserted element is Successfully...");
		System.out.println("Now new array is: ");
		for(int i = 0;i<size+1;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
