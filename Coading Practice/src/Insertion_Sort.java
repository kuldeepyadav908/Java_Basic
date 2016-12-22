import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		System.out.println("Enter the size of an Array: ");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		System.out.println("Insert the element in the Array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		Insertion_Sort is = new Insertion_Sort();
		is.insertionSort(arr);
		System.out.println("Sorted array is...");
		is.printSort(arr);

	}
	void insertionSort(int arr[]){
		int n = arr.length;
		for(int i=1;i<n;i++){
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key ){
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = key;
		}
		
	}
	void printSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
