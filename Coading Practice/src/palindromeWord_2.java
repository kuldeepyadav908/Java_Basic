import java.util.Scanner;

public class palindromeWord_2 {

	public static void main(String[] args) {
		String original,reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String:");
		original = in.nextLine();
		int length = original.length();
		for(int i =length-1; i>=0 ; i--){
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("Palyndrome");
		else
			System.out.println("Not Palindrome");

	}

}
