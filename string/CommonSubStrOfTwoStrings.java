package string;

import java.util.*;

//Two Strings have common SubString or not

public class CommonSubStrOfTwoStrings {
	
	public static void main(String a[]) {
		//System.out.println(getcommonSubStringOfTwoStrings("tyyui","llll"));
		System.out.println(twoStrings("tyyui","llll"));
	}

	private static Boolean getcommonSubStringOfTwoStrings(String s1, String s2) {
		Set<Character> s = new HashSet<Character>();
		for(int i = 0; i<s1.length();i++) {
			s.add(Character.toLowerCase(s1.charAt(i)));
		}
		if(s.size() == 26) {
			return true;
		}
		for(int i = 0; i<s2.length();i++) {
			if(s.contains(Character.toLowerCase(s2.charAt(i)))) {
				return true;
			}
		}
		
		return false;
	}
	
	static boolean twoStrings(String s1, String s2)  
    { 
        // vector for storing character occurrences 
        boolean v[]=new boolean[26]; 
        Arrays.fill(v,false); 
      
        // increment vector index for every 
        // character of str1 
        for (int i = 0; i < s1.length(); i++) 
            v[s1.charAt(i) - 'a'] = true; 
          
        // checking common substring of str2 in str1 
        for (int i = 0; i < s2.length(); i++)  
            if (v[s2.charAt(i) - 'a'])  
            return true; 
          
        return false;      
    } 

}
