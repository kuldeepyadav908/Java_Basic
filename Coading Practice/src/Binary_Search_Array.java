import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search_Array {

	public static void main(String[] args) {
		System.out.println("Enter the Size of Array:");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the Elements in the array:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array are...");
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		System.out.println("Enter the Search element in Array: ");
		int search = sc.nextInt();
		int first = 0;
		int last = arr.length - 1;
		int mid = (first+last)/2;
		while(first <= last){
			if(arr[mid] < search ){
				first = mid + 1;
			}
			else if(arr[mid] == search){
				System.out.println(search+" Found in Middle location: "+(mid+1));
				break;
			}
			else
				last = mid - 1;
			mid = (first+last)/2;
		}
		if(first > last){
			System.out.println("Not found "+search+" in the Array.");
		}
	}

}
