package StringClass;

public class Lab491 {

	public static void main(String[] args) {
		String str = "JLCINDIA";
		char carr[] = str.toCharArray();
		System.out.println("\n**char Array**");		//**char Array**
		for(int i=0;i<carr.length;i++){
			char ch = carr[i];
			System.out.println(i+"\t"+ch);			/*0		J
													  1		L
													  2		C
													  3		I
													  4		N
													  5		D
													  6		I
													  7		A	*/
		}
	}

}
