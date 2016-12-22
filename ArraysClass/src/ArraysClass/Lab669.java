package ArraysClass;

import java.util.Arrays;

public class Lab669 {

	public static void main(String[] args) {
		int arr[] = new int[]{10,43,23,89,45};
		System.out.println("\n**Natural Order**");	//**Natural Order**
		for(int i=0;i<arr.length;i++)
			System.out.println(i+"\t"+arr[i]);		/*0	10
													  1	43
													  2	23
													  3	89
													  4	45	*/
		System.out.println("\n**Sorted Order**");	//**Sorted Order**
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(i+"\t"+arr[i]);		/*0	10
													  1	23
													  2	43
													  3	45
													  4	89	*/
		System.out.println("\n**Binary Search - 47**");	//**Binary Search - 47**
		int indx = Arrays.binarySearch(arr, 47);
		System.out.println(indx);						//-5
		indx = Arrays.binarySearch(arr, 23);
		System.out.println(indx);						//1
		System.out.println("\n**equals(int[],int[])**");//**equals(int[],int[])**
		int values[] = new int[]{43,23,89,45,10};
		System.out.println(Arrays.equals(arr, values));	//false
		int data[] = new int[]{43,23,89,45,10};
		System.out.println(Arrays.equals(values, data));//true
	}

}
