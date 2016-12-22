package StringClass;

public class Lab492 {

	public static void main(String[] args) {
		String str = "JLCINDIA";
		byte barr[] = str.getBytes();
		System.out.println("\n**byte Array**");				//**byte Array**
		for(int i=0;i<barr.length;i++){
			byte b = barr[i];
			System.out.println(i+"\t"+b+"\t"+(char)b);		/*0		74		J
															  1		76		L
															  2		67		C
															  3		73		I
															  4		78		N
															  5		68		D
															  6		73		I
															  7		65		A	*/
		}

	}

}
