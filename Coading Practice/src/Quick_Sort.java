import java.util.Scanner;

public class Quick_Sort {

	public static void main(String[] args) {
		System.out.println("Enter the size of an Array: ");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		System.out.println("Insert the Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int n = arr.length;
		Quick_Sort qs = new Quick_Sort();
		qs.quickSort(arr, 0, n-1);
		System.out.println("Sorted array is...");
		printSort(arr);
		

	}
	
	int partition(int arr[],int low,int high){
		int pivot = arr[high];
		int i =(low - 1);
		for(int j = low;j <= high-1;j++){
			if(arr[j] <= pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
		
	}
	void quickSort(int arr[],int low,int high){
		if(low < high){
			int pi = partition(arr, low, high);
			quickSort(arr,low, pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	static void printSort(int arr[]){
		int n = arr.length;
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
