package Lab578;

public class Lab578 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setPriority(10);						//Thread[Thread-0,10,main]
		//t1.setPriority(0);					//java.lang.IllegalArgumentException
		//t1.setPriority(11);					//java.lang.IllegalArgumentException
		System.out.println(t1);
	}

}
class MyThread extends Thread{}