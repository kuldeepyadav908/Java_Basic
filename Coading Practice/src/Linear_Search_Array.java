import java.util.Scanner;

public class Linear_Search_Array {

	public static void main(String[] args) {
		System.out.println("Enter How many number you enter: ");
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[sc.nextInt()];
		System.out.println("Enter the values:");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the number which Search...");
		int c = 0;
		int x = sc.nextInt();
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == x){
				c++;
				break;
			}
		}
		if(c == 1)
			System.out.println("Found: "+x);
		else
			System.out.println("Not Found: "+x);

	}

}
