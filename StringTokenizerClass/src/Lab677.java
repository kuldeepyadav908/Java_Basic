import java.util.StringTokenizer;

public class Lab677 {

	public static void main(String[] args) {
		String str = "Hi This is JLC,Java Learning Center";
		StringTokenizer tok = new StringTokenizer(str);
		System.out.println("Count:"+tok.countTokens());				//Count:6
		while(tok.hasMoreTokens()){
			String data = tok.nextToken();
			System.out.println(data);								/*Hi
																	  This
																	  is
																	  JLC,Java
																	  Learning
																	  Center	*/
		}
		System.out.println("Count:"+tok.countTokens());				//Count:0
		System.out.println("\n\nWith,Delimiter\n");					//With,Delimiter
		String data = "99,Srinivas,Sri@jlc.com,65799999";
		StringTokenizer tkns = new StringTokenizer(data, ",");
		int id = Integer.parseInt(tkns.nextToken());
		String nm = tkns.nextToken();
		String eml = tkns.nextToken();
		long phn = Long.parseLong(tkns.nextToken());
		System.out.println("Id: "+id);								//Id: 99
		System.out.println("Name: "+nm);							//Name: Srinivas
		System.out.println("Email: "+eml);							//Email: Sri@jlc.com
		System.out.println("Phone: "+phn);							//Phone: 65799999
	}

}
