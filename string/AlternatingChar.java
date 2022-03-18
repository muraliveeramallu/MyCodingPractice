package string;

import java.util.Stack;

public class AlternatingChar {

	public static void main(String[] args) {
		AlternatingChar a = new AlternatingChar();

		System.out.println(a.getCount("AAAA"));
		System.out.println(a.getCount1("BBBBB"));
		System.out.println(a.getCount1("ABABABABABA"));
		System.out.println(a.getCount1("BABABABABA"));
		System.out.println(a.getCount1("AAABBB"));
	}

	private int getCount(String string) {
		int count =0;
		for(int i = 0; i<string.length();i++) {
			if(i<string.length()-1) {
			if(string.charAt(i)==string.charAt(i+1)) {
				count++;
			}
			}
		}
		return count;
	}
	
	private int getCount1(String string) {
		int count =0;
		for(int i = 1; i<string.length();i++) {
			if(string.charAt(i)==string.charAt(i-1)) {
				count++;
			}
		}
		return count;
	}


}
