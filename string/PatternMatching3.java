package string;

import java.lang.reflect.Array;
import java.util.*;

/*
 * Input:  
dict = ["abb", "abc", "xyz", "xyy"];
pattern = "foo"
Output: [xyy abb]
Explanation: 
xyy and abb have same character at index 1 and 2 like the pattern

Input:  
dict = ["abb", "abc", "xyz", "xyy"];
pat = "mno"
Output: [abc xyz]
Explanation: 
abc and xyz have all distinct characters, similar to the pattern

Input:  
dict = ["abb", "abc", "xyz", "xyy"];
pattern = "aba"
Output: [] 
Explanation: 
Pattern has same character at index 0 and 2. 
No word in dictionary follows the pattern.

Input:  
dict = ["abab", "aba", "xyz", "xyx"];
pattern = "aba"
Output: [aba xyx]
Explanation: 
aba and xyx have same character at index 0 and 2 like the pattern

 */

public class PatternMatching3 {
	
	public static void main(String a[]) {
		getPatternMatch(new String[] {"abb", "abc", "xyz", "xyy"},"bcc");
		
	}

	private static List getPatternMatch(String[] s, String pattern) {
	int patternNumber = 0;
	 patternNumber = getPatternNumber(pattern);
	 List<String> output = new ArrayList<>();
	 for(int i=0; i<s.length;i++) {
		 int temp = getPatternNumber(s[i]);
		 if(patternNumber == temp) {
			 output.add(s[i]);
		 }
	 }
	 return output;
		
	}

	private static int getPatternNumber(String s) {
       Map<Character, Integer> m = new HashMap<>();
       int num = 1;
       int value = 0;
      for(int i=0; i<s.length();i++) {
    	   if(!m.containsKey(s.charAt(i))) {
    		   m.put(s.charAt(i), num);
    		   num++;
    	   } 
    	   value = value*10+m.get(s.charAt(i));
       }
       /*for(int i=0; i<s.length();i++) {
         value = value*10+m.get(s.charAt(i));
       }*/
       return value;
      
	}

}
