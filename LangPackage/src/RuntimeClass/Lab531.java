package RuntimeClass;

public class Lab531 {

	public static void main(String[] args) throws Exception {
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("mspaint");
			
			//OPEN Welcome.txt FILE in NOTEPAD
			String cmds[] = {"notepad","D:\\Welcome.txt"};
			Process p1 = rt.exec(cmds);
			
			String cmds1[] = {"\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"","http://www.jlcindia.com"};
			Process p2 = rt.exec(cmds1);
			
			System.out.println("Press ENTER to close all process");
			System.in.read();
			p.destroy();
			p1.destroy();
			p2.destroy();
			System.out.println("Main Completed");
	}

}
