package StringClass;

public class Lab490 {

	public static void main(String[] args) {
		String str = "JLCINDIA";
		int len = str.length();
		System.out.println(str);						//JLCINDIA
		System.out.println(str.charAt(0));				//J
		System.out.println(str.charAt(3));				//I
		System.out.println(str.charAt(4));				//N
		System.out.println();
		for(int i=0;i<len;i++){
			System.out.println(i+"\t"+str.charAt(i));	/*0		J
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
