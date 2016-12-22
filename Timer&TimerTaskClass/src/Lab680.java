import java.util.Timer;
import java.util.TimerTask;

public class Lab680 {

	public static void main(String[] args) {
		System.out.println("About to shedule task");
		new Reminder(10);
		System.out.println("Task Sheduled");

	}

}
class Reminder{
	Timer timer;
	public Reminder(int seconds) {
		timer = new Timer();
		timer.schedule(new RemindTask(), seconds*1000);
		
	}
	class RemindTask extends TimerTask{
		public void run() {
			System.out.println("Time's up!");
			timer.cancel();
		}
	}
}
