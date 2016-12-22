package ArraysClass;

import java.util.Arrays;
import java.util.List;

public class Lab670 {

	public static void main(String[] args) {
		int[] arr = new int[]{10,43,23,89,45};
		for(int i=0;i<arr.length;i++)
			System.out.println(i+"\t"+arr[i]);			/*0	10
														  1	43
														  2	23
														  3	89
														  4	45	*/
		System.out.println("\n**fill(int[],101)**");	//**fill(int[],101)**
		Arrays.fill(arr, 101);
		for(int i=0;i<arr.length;i++)
			System.out.println(i+"\t"+arr[i]);			/*0	101
														  1	101
														  2	101
														  3	101
														  4	101	*/
		Object values[] = new Object[5];
		values[0] = "Srinivas";
		values[1] = new Integer(123);
		values[2] = new Boolean(true);
		values[3] = new Double(12.67);
		List list = Arrays.asList(values);
		System.out.println(list);						//[Srinivas, 123, true, 12.67, null]
	}

}
