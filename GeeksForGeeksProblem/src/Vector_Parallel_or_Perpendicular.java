import java.util.Scanner;

public class Vector_Parallel_or_Perpendicular {

	public static void main(String[] args) {
		int vector1[] = new int[3];
		int vector2[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Test cases:");
		int test = sc.nextInt();
		for(int i=0;i<test;i++){
				System.out.println("Enter the first 3D-vector constant value:");
				System.out.println("i\tj\tk "+"format");
				for(int k=0;k<3;k++){
					vector1[k] = sc.nextInt();
				}
				System.out.println("Enter the second 3D-vector constant value:");
				System.out.println("i\tj\tk "+"format");
				for(int k=0;k<3;k++){
					vector2[k] = sc.nextInt();
				}
				int AdotB = vector1[0]*vector2[0] + vector1[1]*vector2[1] + vector1[2]*vector2[2];
				int AxB = (vector1[1]*vector2[2] - vector1[2]*vector2[1]) - 
						  (vector1[0]*vector2[2] - vector1[0]*vector2[1]) + 
						  (vector1[0]*vector2[1] - vector1[1]*vector2[0]);
				//int Asqure = (int)(Math.pow(vector1[0], 2)+Math.pow(vector1[1], 2)+Math.pow(vector1[1], 2));
				if(AdotB == 0)
					System.out.println("A and B are Perpendicular VECTOR");
				else if((AxB * AxB) == 0)
					System.out.println("A and B are Parallel VECTOR");
				else
					System.out.println("None");
			}
		}

}
