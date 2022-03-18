package string;

import java.util.*;

//This program is to print all consecutive charecters in a String
public class printAllConsecutiveCharsInAString {
	public static void main(String[] args) {
     printConsicutive(" HHi Heeeleelo");
	}

	private static void printConsicutive(String input) {
      Set<Character> s = new HashSet<Character>();
      for(int i = 1; i<input.length();i++) {
    	  if(input.charAt(i)==input.charAt(i-1)) {
    		  s.add((Character)input.charAt(i));
    	  }
      }
      Iterator ite = s.iterator();
      while(ite.hasNext()) {
    	  System.out.print(ite.next()+" ");
      }
	}
}
