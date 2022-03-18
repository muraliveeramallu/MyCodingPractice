package goldMan;

public class NumberToStringForm {

	public static void main(String[] args) {
		System.out.println(getNumberEquivalentString("567"));
		System.out.println(getNumberEquivalentString("9"));
		System.out.println(getNumberEquivalentString("1250"));
		System.out.println(getNumberEquivalentString("105"));
		System.out.println(getNumberEquivalentString("125"));
		System.out.println(getNumberEquivalentString("3000"));
		System.out.println(getNumberEquivalentString("3002"));
		System.out.println(getNumberEquivalentString("9999"));
		System.out.println(getNumberEquivalentString("0001"));
		System.out.println(getNumberEquivalentString("001"));
		System.out.println(getNumberEquivalentString("01"));
		System.out.println(getNumberEquivalentString("201"));
		System.out.println(getNumberEquivalentString("2001"));
		System.out.println(getNumberEquivalentString("530"));
		
	}

	private static String getNumberEquivalentString(String num) {
		String[] zeros = new String[] { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
				"Nine", "Ten" };
		String[] ones = new String[] { "", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen" };
		String[] tens = new String[] { "","", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty",
				"Ninety" };
		String[] hundreds = new String[] { "Hundred", "Thousend" };

		String number = "";
		int currentNumber = 0;
		int digits = 4;

		for (int i = num.length()-1; i >= 0; i--) {
			if (digits == 4) {
				currentNumber = num.charAt(i) - '0';
				number = zeros[currentNumber]+" "+number;
			}

			if (digits == 3) {
				currentNumber = num.charAt(i) - '0';
               if(currentNumber == 1)
            	   number = ones[currentNumber];
               number = tens[currentNumber]+" "+number;
			}

			if (digits == 2) {
				currentNumber = num.charAt(i) - '0';
				if(currentNumber != 0)
				 number = zeros[currentNumber] +" "+hundreds[0]+" "+number;
			}

			if (digits == 1) {
				currentNumber = num.charAt(i) - '0';
				if(currentNumber != 0)
				number = zeros[currentNumber] +" "+ hundreds[1]+" "+number;
			}
			
			digits--;
		}

		return number;
	}

}
