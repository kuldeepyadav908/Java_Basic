import java.util.Locale;

public class Lab678 {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry());			//US
		System.out.println(loc.getDisplayCountry());	//United States
		System.out.println(loc.getLanguage());			//en
		System.out.println(loc.getDisplayLanguage());	//English
		Locale locs[] = Locale.getAvailableLocales();
		for(int i=0;i<locs.length;i++){
			Locale l = locs[i];
			System.out.println(l.getDisplayLanguage()+"\t\t"+l.getDisplayCountry());
		}
	}

}
