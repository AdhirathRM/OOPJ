package palindrome;

public class checkpal {

	public boolean checkPal(int a) {
		int r=0;
		int digit;
		int og =a;
		while(a!=0) {
			digit = a %10;
			r=r*10+digit;
			a=a/10;
		}
		if(og==r)
		{
			return true;
		}
		else
			return false;
	}

}
