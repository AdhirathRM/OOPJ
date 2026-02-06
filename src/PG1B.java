import java.util.Scanner;

public class PG1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if(age>=18)
			System.out.println("You can vote");
		else
			System.out.println("You are underaged.");
	}

}
