package string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteReOccurCharOfString {
	public static void main(String a[]) {
		newStringAfterDelete("aaassdfghdd!@#a  hdjvn avn");
		System.out.println(newStringAfterDeleteNonCollection("aaassdfghdd!@#a  hdjvn avn"));
	}

	public static void newStringAfterDelete(String s) {
		/*List<Character> occuredChars = new ArrayList<Character>();
		String newString = "";
		int index = 0;
		for(int i = 0; i<=s.length(); i++) {
			if(occuredChars.contains(s.charAt(i))) {
				newString[index++] = s[i];
			} else {
				occuredChars.add(s.charAt(i));
			}
		}
		
		return "";*/
		 LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
	        for(int i=0;i<s.length();i++) 
	            lhs.add(s.charAt(i)); 
	          
	        // print string after deleting duplicate elements 
	        for(Character ch : lhs) 
	            System.out.print(ch); 
	}
	

	public static String newStringAfterDeleteNonCollection(String s) {
		 System.out.println(); 
		
		if(s == null || s.length() == 0 || s.length() == 1) {
			return s;
		}
		String newString = "";
		
		for(int i = 0; i<s.length(); i++) {
			if(newString.indexOf(s.charAt(i))<0) {
				newString = newString + s.charAt(i);
			}
		}
		return newString;
		
	}
}
