package SystemClass;

import java.util.Date;

public class Lab528 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Date dt = new Date(time);
		System.out.println(dt);									//Wed Jul 06 13:04:18 IST 2016
		String pnm = System.getProperty("os.name");
		System.out.println("OS.NAME: "+pnm);					//OS.NAME: Windows 8
		System.setProperty("os.name", "UNIX");
		String pnm1 = System.getProperty("os.name");
		System.out.println("OS.NAME: "+pnm1); 					//OS.NAME: UNIX
		System.setProperty("jlc.website","www.jlcindia.com");
		System.out.println(System.getProperty("jlc.website"));	//www.jlcindia.com
	}

}
