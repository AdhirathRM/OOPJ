import java.util.Scanner;
public class lab2b {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number greater than 10 ");
    int a = sc.nextInt();
    for(int j=10;j<=a;j++) {
		System.out.println(j + " ");
	}
}
}
