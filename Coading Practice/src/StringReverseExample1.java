import java.util.Scanner;

public class StringReverseExample1 {

	public static void main(String[] args) {
		String original,reverse ="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String:");
		original = in.nextLine();
		int length = original.length();
		
		String[] String1=original.split(" ");
		
		/*for(int i = length-1;i>=0;i--){
			reverse = reverse + original.charAt(i);
		}*/
		
		
		for(int i =0;i<String1.length;i++){
			for(int j=String1[i].length()-1;j>=0;j--){
			
				reverse = reverse + String1[i].charAt(j);
			}
		
		
		System.out.print(reverse+" ");
		reverse="";
	}
	}
}
