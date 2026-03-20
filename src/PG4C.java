abstract class Bank{
	abstract int getBalance();
}

class BankA extends Bank{

	int getBalance(){
		return 100;
	}
}

class BankB extends Bank{

	int getBalance(){
		return 150;
	}
}

class BankC extends Bank{

	int getBalance(){
		return 200;
	}
}
public class PG4C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bankA = new BankA();
		Bank bankB = new BankB();
		Bank bankC = new BankC();
		
		System.out.println("Balance in BankA is: " + bankA.getBalance() + "$");
		System.out.println("Balance in BankB is: " + bankB.getBalance() + "$");
		System.out.println("Balance in BankC is: " + bankC.getBalance() + "$");
	}

}
