import java.util.Scanner;

public class PG2A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(i);
			}
			System.out.print("\n");
		}
	}

}
