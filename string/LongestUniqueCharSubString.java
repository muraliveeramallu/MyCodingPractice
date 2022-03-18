package string;

import java.util.*;

public class LongestUniqueCharSubString {
	
	public static void main(String a[]) {
		//System.out.println(lengthOUniqueString("qwweyuiotyrrrtyui"));
		//System.out.println(lengthOUniqueString("jjj"));
		//System.out.println(lengthOUniqueString("added"));
		System.out.println(lengthOUniqueString("abccdef"));
		
	}

	private static int lengthOUniqueString(String string) {
		int max = 0;
		int s = 0;
		int e = 0;
		Set<Character> set = new HashSet<>();
		while(e < string.length()) {
			string.charAt(e);
			if(!set.contains(string.charAt(e))) {
				set.add(string.charAt(e));
				e++;
				max = Math.max(max, e-s);
			} else {
				set.remove(string.charAt(s));
				s++;
			}
		}
		return max;
	}

}
