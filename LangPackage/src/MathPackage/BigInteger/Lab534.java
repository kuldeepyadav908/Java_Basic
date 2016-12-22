package MathPackage.BigInteger;

import java.math.BigInteger;

public class Lab534 {

	public static void main(String[] args) {
		BigInteger bint = new BigInteger("4");
		System.out.println(bint.bitCount());	// 1	//Number of 1 bit
		System.out.println(bint.bitLength());	// 3	//Number of total bits allocated
		System.out.println(Long.MAX_VALUE);		//9223372036854775807
		long l = 9223372036854775807l;
		long l2 = 100;
		long l3 = l+l2;							
		System.out.println(l3);					////-9223372036854775709
		
	}

}
