class Customer{
	String cname;
	int billamt;
	double discount;
	float payamt;
	Customer(){
		cname = "Adhi";
		billamt= 300;
	}
	void display(double a, double b){
		System.out.println("Customer Name: "+cname);
		System.out.println("Bill amount: "+billamt);
		System.out.println("Discount: "+b);
		System.out.println("Payable amount: "+a);
	}
	double calcd() {
		if(billamt>=1000) {
			discount= (0.05)*billamt;}
		if(billamt<1000&&billamt>=500) {
			discount= (0.02)*billamt;}
		if(billamt<500&&billamt>=0) {
			discount=(0.01)*billamt;}
		
		System.out.println(discount);
		return discount;
	}
	
}

public class PG3B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer a=new Customer();
		double x= a.calcd();
		double b=a.billamt-x;
		a.display(b, x);
		
	}

}
