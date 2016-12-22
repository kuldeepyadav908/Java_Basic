import java.util.Scanner;

public class NPr_nCR {

	public static void main(String[] args) {
		int n,r;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of n:");
		n = sc.nextInt();
		System.out.print("Enter the Value of r:");
		r = sc.nextInt();
		try{
			int C = (fact(n)/(fact(n-r)*fact(r)));
			System.out.println("NCr = "+C);
			int P = (fact(n)/(fact(n-r)));
			System.out.println("nPR = "+P);
		}catch(Exception e){
			e.printStackTrace();
		}

	}
	public static int fact(int num){
		if(num == 1)
			return 1;
		else{
		return num = fact(num-1)*num;
		}
	}
}