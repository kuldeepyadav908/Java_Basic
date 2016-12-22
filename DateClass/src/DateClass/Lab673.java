package DateClass;

import java.util.Date;

public class Lab673 {

	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);									//Wed Jun 29 23:19:12 IST 2016
		System.out.println("DATE\t"+dt.getDate());				//DATE	29
		System.out.println("MON\t"+dt.getMonth());				//MON	5
		System.out.println("MON+1\t"+(dt.getMonth()+1));		//MON+1 	6
		System.out.println("YEAR\t"+dt.getYear());				//YEAR	116
		System.out.println("YEAR+1900\t"+(dt.getYear()+1900));	//YEAR+1900	2016
		System.out.println("HOUR\t"+dt.getHours());				//HOUR	23
		System.out.println("MIN\t"+dt.getMinutes());			//MIN	19
		System.out.println("SEC\t"+dt.getSeconds());			//SEC	12
		
		System.out.println("\nStoring date");					//Storing date
		dt.setDate(9);
		dt.setMonth(2);
		dt.setYear(108);
		System.out.println(dt); 								//Sun Mar 09 23:19:12 IST 2008
	}

}
