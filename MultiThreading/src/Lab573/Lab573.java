package Lab573;

public class Lab573 {

	public static void main(String[] args) {
		System.out.println("Main Started");													//Main Started						
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName());					//1		main	main
		for(int i=0;i<args.length;i++){
			String st = args[i];
			System.out.println(th.getId()+"\t"+th.getName()+"\t"+tg.getName()+"\t"+st);		//1		main	main	Sri
																							//1		main	main	JLC
		}
		System.out.println("Main Completed");												//Main Completed
	}

}
