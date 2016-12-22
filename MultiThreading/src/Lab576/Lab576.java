package Lab576;

public class Lab576 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("WE");
		MyThread th1 = new MyThread(tg,"JLC-Thread");
		MyThread th2 = new MyThread();
		th1.start();
		th2.start();
	}

}
class MyThread extends Thread{
	public MyThread(ThreadGroup tg,String name) {
		super(tg,name);
	}
	MyThread() {}
	public void run() {
		ThreadGroup tg = getThreadGroup();
		int pri = getPriority();
		for(int i=0;i<5;i++){
			System.out.println(i+"\t"+getName()+"\t"+tg.getName()+"\t"+pri);
		}
	}
}