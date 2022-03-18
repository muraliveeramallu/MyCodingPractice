package string;

import java.lang.reflect.Array;

public class SumOfCharInString {
	
	int sumOfChar(String input) {
		int sum = 0;
		for(int i=1; i<=input.length();i++){
			try {
			sum = sum + Integer.parseInt(input.substring(i-1, i));
			}
			catch(Exception e){
				continue;
			}
		}
		return sum;
		
	}
	
	int sumOfChar1(String input) {
		int sum = 0;
		for(int i=0; i<input.length();i++){
			if(Character.isDigit(input.charAt(i))) {
				sum = sum + Character.getNumericValue(input.charAt(i));
			}
			
		}
		return sum;
	}
	
	public static void main(String[] a) {
		
		SumOfCharInString s = new SumOfCharInString();
		System.out.println(s.sumOfChar("1#234qqqqa1D:1 1"));
		System.out.println(s.sumOfChar1("1#234qqqqa1D:1 1"));
		//System.out.println("1#234qqqqa1D:1 1".substring(0, 5));
	}

}
