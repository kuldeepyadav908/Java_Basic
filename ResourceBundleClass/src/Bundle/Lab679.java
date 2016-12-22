package Bundle;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Lab679 {

	public static void main(String[] args) throws IOException {
		String languageCode = "en";
		System.out.println("H-> Hindi,E->English");
		System.out.println("Enter your choice");
		int asc = System.in.read();
		char ch = (char)asc;
		ch = Character.toUpperCase(ch);
		if(ch=='H'){
			System.out.println("\t**You have selected HINDI");
			languageCode = "hi";
		}
		else if(ch=='E'){
			System.out.println("\t**You have selected ENGLISH");
			languageCode = "en";
		}
		else{
			System.out.println("\t**Invalid Input,Using Default LANGUAGE");
		}
		Locale locale = new Locale(languageCode);
		ResourceBundle rbRef = ResourceBundle.getBundle("messages",locale);
		Enumeration en = rbRef.getKeys();
		while(en.hasMoreElements()){
			String key = en.nextElement().toString();
			String val = rbRef.getString(key);
			System.out.println(key+"\t"+val);
		}
	}

}
