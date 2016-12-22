package CalenderClass;

import java.util.Calendar;

public class Lab675 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		//System.out.println("TODAY: "+today);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DATE, 13);
		cal.set(Calendar.MONTH,5);
		cal.set(Calendar.YEAR, 2014);
		//System.out.println("SETTED:"+cal);
		System.out.println("AFTER TODAY:"+today.after(cal));		//AFTER TODAY:true
		System.out.println("BEFORE TODAY:"+today.before(cal));		//BEFORE TODAY:false
		System.out.println("compareTo: "+today.compareTo(cal));  	//compareTo: 1

	}

}
