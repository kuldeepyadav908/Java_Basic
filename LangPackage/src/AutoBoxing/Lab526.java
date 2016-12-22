package AutoBoxing;

public class Lab526 {

	public static void main(String[] args) {
		JlcService2 serv = new JlcService2();
		byte b1 = 12;
		byte b2 = 23;
		serv.show(b1, b2);

	}

}
class JlcService2{
	/*void show(int ab,int bc){
		System.out.println("\n**show(int,int)");			
	}*/
	/*void show(byte ab,byte bc){
		System.out.println("\n**show(byte,byte)");			
	}*/
	void show(Byte ab,Byte bc){
		System.out.println("\n**show(Byte,Byte)");			//**show(Byte,Byte)
	}
	void show(byte... ab){
		System.out.println("\n**show(byte...)");
	}
}