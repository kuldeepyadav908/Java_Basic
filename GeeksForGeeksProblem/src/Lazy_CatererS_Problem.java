import java.util.Scanner;

public class Lazy_CatererS_Problem {

	public static void main(String[] args) {
		int nCut;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Test Case:");
		int test = sc.nextInt();
		for(int i=0;i<test;i++){
			System.out.println("Enter the number of cuts: ");
			nCut = sc.nextInt();
			int nPices = 0;
		    int pices = 0;
		    while (pices <= nCut) {
		        nPices += pices;
		        pices++;
		    }
		    System.out.println("Number of Pices is: " + (nPices+1));
		}

	}

}
