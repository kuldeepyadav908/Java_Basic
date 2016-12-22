/*WAP to read a char and check the following-
 * a). Upper Case Alphabet
 * b). Lower Case Alphabet
 * c). Digit
 * d). Special characters */

import java.io.IOException;
import java.util.Scanner;

public class Test_characters{

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter any charecter: ");
		char ch = (char)System.in.read();
		if(ch>=65 && ch<=90)
			System.out.println("Character is UPPER CASE: "+ch);
		else if(ch>=97 && ch<=122)
			System.out.println("Character is LOWER CASE: "+ch);
		else if(ch>=48 && ch<=57)
			System.out.println("Character is Digit: "+ch);
		else
			System.out.println("Character is Special character: "+ch);
	}

}
