package string;
//This program is to delete the consecutive duplicate Char from String ex hi heelloo o/p hi helo

public class RemoveConsecutiveDuplicateCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(removeConsicutive(" HHi Heeeleelo"));
	} 

	private static String removeConsicutive(String input) {
		if(input == null || input=="")
			return input;
		String output = ""+input.charAt(0);
		for(int i = 1; i< input.length(); i++)
		{
			if(input.charAt(i) != input.charAt(i-1)) {
				output = output+input.charAt(i);
			}
		}	
		
		return output;
	}

}
