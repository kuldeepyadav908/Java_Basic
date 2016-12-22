package MathPackage.BigDecimalClass;

import java.math.BigDecimal;

public class Lab536 {

	public static void main(String[] args) {
		double d1 = Double.MAX_VALUE;
		double d2 = d1+100;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("\n****");
		BigDecimal bd1 = new BigDecimal(Double.MAX_VALUE);
		System.out.println(bd1);
		BigDecimal bd2 = new BigDecimal(100);
		BigDecimal res = bd1.add(bd2);
		System.out.println(res);
		BigDecimal bd3 = new BigDecimal(Double.POSITIVE_INFINITY);
		System.out.println(bd3);
	}

}
