import java.util.Scanner;

public class Armstrong_Generate {

	public static void main(String[] args) {
		int start,end,rem,temp,n,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter starting number in 3-digit");
		start = sc.nextInt();
		System.out.println("Enter ending number in 3-digit");
		end = sc.nextInt();
		for(int i = start+1;i<end;i++){
			temp = i;
			n = 0;
			while(temp != 0){
				rem = temp % 10;
				n = n+ rem*rem*rem;
				temp = temp/10;
			}
			if(i==n){
				if(count == 0){
					System.out.println("Armstrong number is: ");
				}
				System.out.println(i+" ");
				count++;
			}
			
		}
		if(count == 0){
			System.out.println("Armstrong number not found");
		}

	}

}
