package string;

import java.util.HashSet;

public class SherlockValidString {

	public static void main(String[] args) {
		SherlockValidString  s = new SherlockValidString();
		System.out.println(s.isValidString("aabbcd"));
		System.out.println(s.isValidString("aabbccddeefghi"));
		System.out.println(s.isValidString("abcdefghhgfedecba"));

		System.out.println(s.isValidString("aabbccdd"));

		System.out.println(s.isValidString("abcd"));

		System.out.println(s.isValidString("ajhfjkhfdjkhfkjfhdjfhjfhefewfh"));
	}

	private boolean isValidString(String s) {
		HashSet<Character> set = new HashSet<Character>(); 
		
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		
		return (s.length()%set.size())-1==0 || (s.length()%set.size())==0 ?true:false;
	}

}
