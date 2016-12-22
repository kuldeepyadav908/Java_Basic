import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		int decnum,rem,quot,i = 1,j;
		int bin[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Decimal Number:");
		decnum = sc.nextInt();
		quot = decnum;
		while(quot != 0){
			bin[i++] = quot%2;
			quot = quot/2;
		}
		System.out.println("Binary number of "+decnum+": ");
		for(j = i - 1; j>0; j--){
			System.out.print(bin[j]);
		}
	}

}

