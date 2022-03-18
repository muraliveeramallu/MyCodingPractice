package recursion;

public class NumberPallindrom {
	
	static int sum = 0;

	public static void main(String[] args) {
		int number  = 2233;
		
		int reverse = reverse(number);
		System.out.println(reverse);
		if(number == reverse)
		   System.out.println(true);
		else
		   System.out.println(false);
	}

	private static int reverse(int i) {
		if(i==0)
			return 0;
		
		int mod = i%10;
	    sum = (sum*10)+mod;
		int divide = i/10;
	    
		sum =  sum+reverse(divide);
		if(sum == i) {
			 System.out.println(true);
		}
		else
			 System.out.println(false);
		
		return 0;
	}

}
