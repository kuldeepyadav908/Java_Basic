package StringBuffer_Reader;

public class Lab504 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JLC");
		System.out.println("C: "+sb.capacity());		//C: 19
		System.out.println("L: "+sb.length());			//L: 3
		sb.trimToSize();
		System.out.println("C: "+sb.capacity());		//C: 3
		System.out.println("L: "+sb.length());			//L: 3

	}

}
