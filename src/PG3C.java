class mobilebill{
	int loc;
	int isd;
	int netp;
	double bill;
	mobilebill(){
		loc=0;
		isd=0;
		netp=0;
		bill=0;
	}
	mobilebill(int loc,int isd,int netp){
		this.loc=loc;
		this.isd=isd;
		this.netp=netp;
	}
	void calc() {
		bill=loc*0.01+isd*1+netp*500;
	}
	void display() {
		System.out.println("Bill amt: "+bill);
	}
}
public class PG3C {

	public static void main(String[] args) {
		mobilebill b= new mobilebill();
		b.calc();
		b.display();
		mobilebill a= new mobilebill(10,20,3);
		a.calc();
		a.display();
		
	}

}
