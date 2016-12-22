package RuntimeClass;

public class Lab530 {

	public static void main(String[] args) {
		Runtime rt = null;
		//rt = new Runtime();
		System.out.println(Runtime.getRuntime());				//java.lang.Runtime@19e0bfd
		System.out.println(Runtime.getRuntime());				//java.lang.Runtime@19e0bfd
		rt = Runtime.getRuntime();
		System.out.println("A.P: "+rt.availableProcessors());	//A.P: 4
		System.out.println("M.M: "+rt.maxMemory());				//M.M: 259522560
		System.out.println("T.M: "+rt.totalMemory());			//T.M: 16252928
		System.out.println("F.M: "+rt.freeMemory()); 			//F.M: 15709760
	}

}
