package StringClass;

import java.util.Scanner;

public class Lab460 {

	public static void main(String[] args) {
		String str1 = "JLC";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter JLC String:");
		String str3 = sc.nextLine();
		System.out.println("Re Enter JLC String:");
		String str4 = sc.nextLine();
		String str5 = str3.intern();
		String str6 = str4.intern();
		System.out.println(str3==str4);			//false
		System.out.println(str5==str6);			//true
		System.out.println(str1==str5);			//true
		
	}

}
