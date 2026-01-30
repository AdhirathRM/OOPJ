import java.util.Scanner;

public class lab2e {

	static int sumorsmtg(int a) {
		int sum=0;
		for(int i=1;i<=a;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		int b= sumorsmtg(a);
		System.out.println(b);

	}

}
