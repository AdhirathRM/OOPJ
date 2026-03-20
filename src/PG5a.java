interface Exam{
	abstract double percentage();
}
class Student1{
	String name;
	int rno;
	int m;
	int tm;
	Student1(){
		this.name="Adhi";
		this.rno = 10;
		this.m=88;
		this.tm=100;
	}
	void Display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rno);
		System.out.println("Marks: "+m);
		System.out.println("Total Marks: "+tm);
	}
}
class Result extends Student1 implements Exam{
	Result(){
		super();
	}
	
	
	
	
	
	public double percentage() {
		double p = (this.m*100)/this.tm;
		return p;
	}
	void Display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rno);
		System.out.println("Marks: "+m);
		System.out.println("Total Marks: "+tm);
		System.out.println("Percentage: "+percentage());
	}
}

public class PG5a {

	public static void main(String[] args) {
		Result r = new Result();
		r.Display();
	}

}
