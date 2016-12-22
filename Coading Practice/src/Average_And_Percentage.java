import java.util.Scanner;

public class Average_And_Percentage {

	public static void main(String[] args) {
		int noSub;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		noSub = sc.nextInt();
		int[] marks = new int[noSub];
		float sum = 0;
		float Avg,Per;
		System.out.println("Enter the obtained Marks of all subjects:");
		for(int i=0;i<=marks.length-1;i++){
			marks[i] = sc.nextInt();
			sum = sum + marks[i];
		}
		Avg = sum/noSub;
		Per = sum/(noSub * 100) * 100;
		System.out.println("Average Marks: "+Avg);
		System.out.printf("Percentage is: %f ",Per);
		System.out.println("%");
		if(Per>85)
			System.out.println("Your Grade is: A");
		else if(Per>60 && Per<85)
			System.out.println("Your Grade is: B");
		else if (Per>45 && Per<60)
			System.out.println("Your Grade is: C");
		else
			System.out.println("Your Grade is: FAIL");
	}
	

}
