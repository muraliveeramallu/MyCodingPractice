package string;

import java.util.*;

public class LongestSubStringOfKUniqueCharectors {
	
	public static void main(String[] s) {
		System.out.println(getLongestSubString("rrrtttttyyuhhuhhuhe",3));
	}

	private static int getLongestSubString(String str, int k) {
		int s = 0;
		int e = 0;
		int max = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i<str.length();i++) {
			char c = str.charAt(i);
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
			e++;
			while(map.size()>k) {
				char c1 = str.charAt(s);
				if(map.get(c1)>1) {
				   map.put(c1, map.get(c1)-1);
				   s++;
				}
				else {
				   map.remove(c1);
				   s++;
				}
			}
			max = Math.max(max,e-s);
		}
		

		return Math.max(max,e-s);
	}

}
