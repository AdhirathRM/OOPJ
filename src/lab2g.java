import java.util.Scanner;
public class lab2g {

	static void whatever(int a) {
		if(a==0) {
			System.out.println("Its zero");
		}
		else if(a<0)
			System.out.println("Its negative");
		else
			System.out.println("Its positive");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int a= sc.nextInt();
		whatever(a);

	}

}
