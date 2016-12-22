package StringClass;

public class Lab496 {

	public static void main(String[] args) {
		String str = "JLC,Java Learning Center.No 1 in Java Training and Placement.Java is a popular language.";
		String res[] = str.split("Java",1);
		System.out.println("Length: "+res.length);			//Length: 1
		for(int i=0;i<res.length;i++){
			String st = res[i];
			System.out.println(i+"\t"+st);					//0	JLC,Java Learning Center.No 1 in Java Training and Placement.Java is a popular language.
		}
		String res1[] = str.split("Java", 2);
		System.out.println("Length: "+res1.length);			//Length: 2
		for(int i=0;i<res1.length;i++){
			String st = res1[i];
			System.out.println(i+"\t"+st);					//0	JLC,
															//1	 Learning Center.No 1 in Java Training and Placement.Java is a popular language.
		}
	}

}
