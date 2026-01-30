import java.util.Scanner;
public class lab2d {
	
	static void oddeven(int a) {
		if(a%2==0) {
			System.out.println("Its even");
		}
		else
			System.out.println("Its odd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		oddeven(a);
	}
	

}
