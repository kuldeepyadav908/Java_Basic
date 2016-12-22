import java.util.Scanner;

public class Armstrong_Num {

	public static void main(String[] args) {
		int n,rem,num=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check no. is armstrong or not ");
		n = sc.nextInt();
		int nu = n;
		while(nu != 0){
			rem = nu%10;
			num = num + rem*rem*rem;
			nu = nu/10;
		}
		if(n == num){
			System.out.println(n+" is Armstrong");
		}
		else
			System.out.println(n+" is not Armstrong");
		}

}
