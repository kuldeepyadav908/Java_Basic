package ArraysClass;

import java.util.Arrays;

public class Lab671 {

	public static void main(String[] args) {
		int[] arr = new int[]{10,43,23,89,45};
		System.out.println(Arrays.toString(arr));			//[10, 43, 23, 89, 45]
		System.out.println("************");					//************
		int[][] darr = {{10,30,20},{32,34},{101,909,404}};
		System.out.println(darr);							//[[I@19e0bfd
		System.out.println(Arrays.toString(darr));			//[[I@139a55, [I@1db9742, [I@106d69c]
		System.out.println(Arrays.deepToString(darr));		//[[10, 30, 20], [32, 34], [101, 909, 404]]
	}

}
