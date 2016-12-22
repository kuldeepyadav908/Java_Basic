import java.util.Scanner;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) {
		int start,end;
		System.out.println("Enter the Range for prime no: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Starting Range: ");
		start = sc.nextInt();
		System.out.print("Enter the Ending Range: ");
		end = sc.nextInt();
		System.out.println("Prime no between "+start+" and "+end+" is: ");
		for(int i = start;i<=end;i++){
			int count = 0;
			for(int j = 2;j<i;j++){
				if(i%j == 0){
					count++;
					break;
				}
				else
					System.out.println("Not Prime Numbers between this range");
			}
			if(count == 0)
				System.out.println(i+ " ");
		}
		
	}

}
