package Lab445;

public class Lab445 {

	public static void main(String[] args) {
		System.out.println("*** With Employee ***");
		Employee emp1 = new Employee(99,9031781734l);
		Employee emp2 = new Employee(99,9031781734l);
		Employee emp3 = new Employee(88,7050366209l);
		Employee emp4 = emp1;
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp4.hashCode());
		
		System.out.println(emp1 == emp2);
		System.out.println(emp1 == emp3);
		System.out.println(emp1 == emp4);
		System.out.println(emp3 == emp4);
		
	}

}
