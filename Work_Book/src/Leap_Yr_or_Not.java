/*WAP to read and display whether it is Leap year or Not*/
import java.util.Scanner;

public class Leap_Yr_or_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		if(year%400 == 0 ||(year%4==0 && year%100 != 0))
			System.out.println("year "+year+" is Leap year");
		else
			System.out.println("Year "+year+" is not Leap year");
	}

}
