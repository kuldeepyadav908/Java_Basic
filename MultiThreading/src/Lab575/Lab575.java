package Lab575;

public class Lab575 {

	public static void main(String[] args) {
		MyThread th1= new MyThread();
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th1);
		t1.start();
		t2.start();
		Thread t = Thread.currentThread();
		for(int i=100;i<=110;i++){
			System.out.println(t.getName()+"-Value is: "+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
class MyThread implements Runnable{
	public void run() {
		Thread th = Thread.currentThread();
		for(int i=1;i<=10;i++){
			System.out.println(th.getName()+"-Value is: "+i);
			try{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}