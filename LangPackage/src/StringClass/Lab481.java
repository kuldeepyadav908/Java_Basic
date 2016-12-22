package StringClass;

public class Lab481 {

	public static void main(String[] args) {
		String str = "Hi,Welcome to JLC(Java Learning center),Java World";
		String str1 = str.replace('J', 'X');
		System.out.println(str1);							//Hi,Welcome to XLC(Xava Learning center),Xava World
		String str2 = str.replaceFirst("Java", "SD");
		System.out.println(str2);							//Hi,Welcome to JLC(SD Learning center),Java World
		String str3 = str.replaceAll("Java", "SD");
		System.out.println(str3);							//Hi,Welcome to JLC(SD Learning center),SD World
		System.out.println(str);							//Hi,Welcome to JLC(Java Learning center),Java World
	}
}
