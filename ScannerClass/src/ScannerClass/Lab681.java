package ScannerClass;

import java.util.Scanner;

public class Lab681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Int Value");
		int val = sc.nextInt();
		System.out.println("Data is: "+val);
		System.out.println("Enter BINARY int value");
		int bin = sc.nextInt(2);
		System.out.println("Data is: "+bin);
		System.out.println("Enter Long int value");
		long data = sc.nextLong();
		System.out.println("Data is: "+data);
		System.out.println("Enter String int value");
		String str = sc.next();
		System.out.println("Data is: "+str);

	}

}
