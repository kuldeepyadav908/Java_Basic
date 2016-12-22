package Lab577;

public class Lab77 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("WE");
		MyThread mth = new MyThread();
		Thread t1 = new Thread(tg,mth,"JLC-Thread");
		Thread t2 = new Thread(mth);
		t1.start();
		t2.start();
	}

}
class MyThread implements Runnable{
	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		int pri = th.getPriority();
		for(int i=0;i<5;i++){
			System.out.println(i+"\t"+th.getName()+"\t"+tg.getName()+"\t"+pri);
		}
		
	}
}