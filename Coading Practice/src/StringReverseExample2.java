import java.util.Scanner;

public class StringReverseExample2 {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence");
		str = sc.nextLine();
		String str1 = StringReverseExample2.reverse(str);
		System.out.println(str1);
		
	}
		public static String reverse(String str) {
	        StringBuilder strBuilder = new StringBuilder();
	        char[] strChars = str.toCharArray();

	        for (int i = strChars.length - 1; i >= 0; i--) {
	            strBuilder.append(strChars[i]);
	        }
	        return strBuilder.toString();
		}
	}
