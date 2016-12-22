import java.util.Scanner;

/* Java Program Example - Find HCF LCM of Two Numbers */

public class HCF_LCM {

	public static void main(String[] args) {
		int a,b,x,y,t,lcm,hcf;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Values: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		a = x;
		b = y;
		while(b != 0){
			t = b;
			b = a%b;
			a = t;
		}
		hcf = a;
		lcm = x*y/hcf;
		System.out.println("LCM = "+lcm);
		System.out.println("HCF = "+hcf);
	}

}
