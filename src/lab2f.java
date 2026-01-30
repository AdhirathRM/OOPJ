import java.util.Scanner;
public class lab2f {
	static float sal(float bassal) {
		float da,hra,totsal;
		da=(5*bassal)/100;
		hra=(8*bassal)/100;
		totsal=da+hra+bassal;
		return totsal;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		float a= sc.nextFloat();
		float totsal= sal(a);
		float hike=(5*totsal)/100;
		float finsal=totsal+hike;
		System.out.println(finsal);
		
	}

}
