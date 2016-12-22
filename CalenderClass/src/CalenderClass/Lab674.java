package CalenderClass;

import java.util.Calendar;
import java.util.Date;

public class Lab674 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		Date dt = (Date) cal.getTime();
		System.out.println(dt);										//Wed Jun 29 23:43:40 IST 2016
		System.out.println("DAY:"+cal.get(Calendar.DATE));			//DAY:29
		System.out.println("DAY:"+cal.get(Calendar.DAY_OF_MONTH));	//DAY:29
		System.out.println("MON:"+cal.get(Calendar.MONTH));			//MON:5
		System.out.println("MON+1:"+(cal.get(Calendar.MONTH)+1));	//MON:6
		System.out.println("YEAR:"+cal.get(Calendar.YEAR));			//YEAR:2016
		System.out.println("HOUR:"+cal.get(Calendar.HOUR));			//HOUR:11
		System.out.println("MIN:"+cal.get(Calendar.MINUTE));		//MIN:43
		System.out.println("SEC:"+cal.get(Calendar.SECOND));		//SEC:40
		System.out.println("AM_PM:"+cal.get(Calendar.AM_PM));		//AM_PM:1
		System.out.println("\n**ADDING 7 DAYS**");					//**ADDING 7 DAYS**
		cal.add(Calendar.DATE, 7);
		System.out.println(cal.getTime());							//Wed Jul 06 23:48:43 IST 2016
		System.out.println("\n**set MONTH as MARCH**");				//**set MONTH as MARCH**
		cal.set(Calendar.MONTH, Calendar.MARCH);
		System.out.println(cal.getTime());							//Sun Mar 06 23:48:43 IST 2016
	}

}
