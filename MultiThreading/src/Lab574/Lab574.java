package Lab574;

public class Lab574 {

	public static void main(String[] args) {
		MyThread th1= new MyThread();
		MyThread th2 = new MyThread();
		th1.start();
		th2.start();
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
class MyThread extends Thread{
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