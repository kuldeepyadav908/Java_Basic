import java.util.Scanner;

public class Delete_Array_Element {

	public static void main(String[] args) {
		int[] arr = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int size = sc.nextInt();
		System.out.println("Enter the Elements...");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("which element delete:");
		int delete = sc.nextInt();
		int count=0;
		for(int i=0;i<size;i++){
			if(arr[i] == delete){
				for(int j=i;j<(size-1);j++){
					arr[j] = arr[j+1];
				}
				count++;
				break;
			}
				
		}
		if(count == 0){
			System.out.println("Element not found.");
		}
		else{
			System.out.println("Element deleted Successfully..");
			System.out.println("Now new Array is:");
			for(int i = 0;i<(size-1);i++)
				System.out.print(arr[i]+" ");
		}
		
	}
}
