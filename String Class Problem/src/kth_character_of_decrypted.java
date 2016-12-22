
public class kth_character_of_decrypted {
	public static void main(String[] args) {
		String str = "ab2cd2";
		int k = 5;
		Encoader en = new Encoader(str,k);
	}
}
class Encoader{
	
	Encoader(String str,int k){
		String expand ="";
		String temp;
		int freq;
		for(int i=0;i<str.length();i++){
			temp = "";
			freq = 0;
			while(str.charAt(i)>='a' && str.charAt(i)<='z'){
				temp.concat(str);
			}
		}
	}
}