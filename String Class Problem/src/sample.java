

public class sample {
	int index;
	String str = "jf5kn3";
	char ch[];
	public void charAt(){
	for(int i=0;i<str.length();i++){
		ch[i] = str.charAt(i);
		String st = ch.toString();
		//int x = Integer.parseInt(st);
		if(ch[i] >= '5'){
			index = i;
			System.out.println(index);
		}
	}
	new sample().show();
	}
	public void show(){
		for(char i: ch)
			System.out.print(i+"\t");
	}
	public void concat(int x){
		String str1 = "";
	}
	/*String temp = "";
	char[] ch1 = new char[x];
		for(int i = 0;i<x;i++){
		ch1[i] = ch[i];
	    temp = ""+ch1[i];
	}
		System.out.println(temp);
	for(char i: ch)
		System.out.print(i+"\t");*/
	public static void main(String[] args) {
		ch = new char[str.length()];
		sample smp = new sample();
		smp.charAt();
}
}