package string;
//This program is to check the string has all a-z charectors or not
import java.util.*;

public class CompleteStringOrNot {

	public static void main(String[] args) {
		System.out.println(isCompleteString("abcdefghijklmnopqrstuvwxyz"));
	}

	private static boolean isCompleteString(String str) {
		if(str.length() < 26)
			return false;
		
		/*Set<Character> s = new HashSet<Character>();
		for(int i = 0; i<str.length();i++) {
			s.add(str.charAt(i));
		}
		
		if(s.size() < 26)
			return false;*/
		
		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.println(str.indexOf(c) );
			System.out.println(str.indexOf((char)(c+32)));
			if(str.indexOf(c) < 0 && str.indexOf((char)(c+32)) < 0) {
				return false;
			}
		}
		
		return true;
	}

}
