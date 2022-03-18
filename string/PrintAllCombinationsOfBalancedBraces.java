package string;

public class PrintAllCombinationsOfBalancedBraces {

	public static void main(String[] args) {
		int n = 6;
		if(n%2>0)
		  System.out.println("Odd Size");
		else
		 printParentheses(n);
	}

	public static void Validparentheses(int openP, int closeP, String string) {
		if (openP == 0 && closeP == 0) // mean all opening and closing in
										// string,
										// print it
			System.out.println(string);
		if (openP > closeP) // means closing parentheses is more than open ones
			return;
		if (openP > 0)
			Validparentheses(openP - 1, closeP, string + "("); // put ( and
																// reduce
																// the count by
																// 1
		if (closeP > 0)
			Validparentheses(openP, closeP - 1, string + ")"); // put ) and
																// reduce
																// the count by
																// 1
	}

	public static void printParentheses(int n) {
		Validparentheses(n / 2, n / 2, "");
	}

}


