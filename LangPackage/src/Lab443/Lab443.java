package Lab443;

public class Lab443 {

	public static void main(String[] args) {
		showClassInfo("JLC");
		Student st = new Student();
		showClassInfo(st);
		Object obj = new Object();
		showClassInfo(obj);

	}
	static void showClassInfo(Object obj){
		Class cls = obj.getClass();
		System.out.println("Class Name: "+cls.getName());
		System.out.println("Package Name: "+cls.getPackage().getName());
		Class scls = cls.getSuperclass();
		if(scls != null)
			System.out.println("Super Class Name: "+scls.getName());
		else
			System.out.println("No Super Class");
	}

}
