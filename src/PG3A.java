import java.util.Scanner;

class perimeter{
	float radius;
	double pi = 3.14;
	void calc()
	{
		double p = 2*pi*radius;
		System.out.println(p);
	}
	
}
public class PG3A {

	public static void main(String[] args) {
		System.out.println("Enter Radius:");
		Scanner sc= new Scanner(System.in);
		perimeter a = new perimeter();
		a.radius= sc.nextFloat();
		a.calc();

	}

}
