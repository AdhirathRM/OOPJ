import java.util.Scanner;

public class PG1C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is " + sum);
	}

}
