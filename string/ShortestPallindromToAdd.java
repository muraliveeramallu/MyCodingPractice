package string;
///https://www.programcreek.com/2014/06/leetcode-shortest-palindrome-java/
//For example, given "aacecaaa", return "aaacecaaa"; given "abcd", return "dcbabcd".

public class ShortestPallindromToAdd {
	
	public static void main(String a[]) {
		System.out.println(addPallindrom("madd"));
	}

	private static String addPallindrom(String str) {
		if(isPallindrom(str))
			return str;
		String output = new String(str);
		String appender = "";
		////for(int i = str.length()-1; i>=0;i--) {
		for(int i = 0; i<str.length();i++) {
			if(i !=str.length()-1)
			appender = str.charAt(i)+appender;
			if(i !=str.length()-1 && isPallindrom(str.substring(i,str.length()-1))) {
				return output+appender;
			} else {
				continue;
			}
		}
		return output+appender;
	}
	
	public static boolean isPallindrom(String s){
		if(s.length() == 1)
	    return false;
		else;
		return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
		
	}
	
	//Solution 2
	public String shortestPalindrome(String s) {
	    int i=0; 
	    int j=s.length()-1;
	 
	    while(j>=0){
	        if(s.charAt(i)==s.charAt(j)){
	            i++;
	        }
	        j--;
	    }
	 
	    if(i==s.length())
	        return s;
	 
	    String suffix = s.substring(i);
	    String prefix = new StringBuilder(suffix).reverse().toString();
	    String mid = shortestPalindrome(s.substring(0, i));
	    return prefix+mid+suffix;
	}

}
