import java.util.Scanner;

public class lab1c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int sum = a + b;
		int diff = a - b;
		int product = a * b;
		int quotient = a / b;
		int remainder = a % b;
		
		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + diff);
		System.out.println("Product = " + product);
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
		

	}

}
