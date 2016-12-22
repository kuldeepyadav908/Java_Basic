package FormatterClass;

import java.util.Formatter;

public class Lab684 {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		String name = "Srinivas";
		int age = 23;
		fmt.format("My name is %s and age is %d", name,age);
		System.out.println(fmt);								//My name is Srinivas and age is 23
		Formatter fmt1 = new Formatter();
		fmt1.format("%c-%f-%b%n%05d-%o-%x-%X", 'C',99.99,true,3456,3456,3456,3456);
		System.out.println(fmt1);								//C-99.990000-true
																//03456-6600-d80-D80

	}

}
