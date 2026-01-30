import java.util.Scanner;

public class lab1e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int a=(num%2);
		if(a==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}

	}

}
