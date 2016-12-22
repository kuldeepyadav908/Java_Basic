package Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab653 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1234);
		al.add(4557);
		al.add(8910);
		showElement(al);
		
		ArrayList<Float> fal = new ArrayList<Float>();
		fal.add(123.45f);
		fal.add(456.78f);
		fal.add(789.456f);
		fal.add(123.432f);
		showElement(fal);
		
		ArrayList<String> sal = new ArrayList<String>();
		//showElement(sal);
	}
	static void showElement(List<? extends Number> list) {
		for(Number num:list){
			System.out.println(num+",");
		}
		System.out.println("\n");

	}

}
