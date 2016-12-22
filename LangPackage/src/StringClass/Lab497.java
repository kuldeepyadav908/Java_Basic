package StringClass;

public class Lab497 {

	public static void main(String[] args) {
		String str = "JLC,Java Learning Center.No 1 in Java Training and Placement.Java is a popular language.";
		String res[] = str.split("Java",0);
		System.out.println("Length: "+res.length);					//Length: 4		
		for(int i=0;i<res.length;i++){
			String st = res[i];
			System.out.println(i+"\t"+st);							/*0	JLC,
																	  1	   Learning Center.No 1 in 
																	  2	   Training and Placement.
																	  3	   is a popular language.	*/				
		}
		String res1[] = str.split("Java", 5);
		System.out.println("Length: "+res1.length);					//Length: 4	
		for(int i=0;i<res1.length;i++){
			String st = res1[i];
			System.out.println(i+"\t"+st);							/*0	JLC,
																	  1	   Learning Center.No 1 in 
																	  2	   Training and Placement.
																	  3	   is a popular language.	*/
		}
	}

}
