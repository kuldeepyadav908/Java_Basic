import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Lab676 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		String res = fmt.format(new Date());
		System.out.println(res);							//2016-06-30
		SimpleDateFormat frm1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String res1 = frm1.format(new Date());
		System.out.println(res1);							//2016-06-30 00:25:04
		Date date = fmt.parse("2013-10-25");
		System.out.println(date); 							//Fri Oct 25 00:00:00 IST 2013
	}

}
