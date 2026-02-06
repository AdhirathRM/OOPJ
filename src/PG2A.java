import java.util.Scanner;

public class PG2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
			while(j<=i) {
			System.out.print(i);
			j=j+1;
			}
			}
			System.out.print("\n");
		}
	}

}
