import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		System.out.println("Enter the size of an Array: ");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		System.out.println("Insert the element in Array: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		Selection_Sort ss = new Selection_Sort();
		ss.selectionSort(arr);
		System.out.println("Sorted array is: ");
		ss.printSorting(arr);

	}

	void selectionSort(int arr[]){
		int min = 0;
		int n = arr.length;
		for(int i=0;i<n;i++){
			min = i;
			for(int j=i+1;j<n;j++){
				if(arr[min] > arr[j])
					min = j;
				{
					int temp = arr[i];
					arr[i] = arr[min];
					arr[min] = temp;
				}
			}
		}
	}
	void printSorting(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;++i){
			System.out.print(arr[i]+" ");
		}
	}
}
