import java.util.Scanner;

public class ReverseNumberWhile {

	public static void main(String[] args) {
		int number = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		number = sc.nextInt();
		ReverseNumberWhile rnw = new ReverseNumberWhile();
		
		System.out.println("Reverse of input: "+rnw.reverseNumber(number));
	}
	public int reverseNumber(int number){
		int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }

}
