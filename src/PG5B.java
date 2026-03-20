import oddeven.*;
import palindrome.*;

public class PG5B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkpal a = new checkpal();
		int x =12321;
		if(a.checkPal(x)) {
			System.out.println(x+" is a palindrome");
		}
		else
			System.out.println(x+" is not a palindrome");
		checkoddeven b = new checkoddeven();
		b.checkoe(x);
	}

}
