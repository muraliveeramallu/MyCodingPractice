package myPractice;

public class WildcardMatching {
	public static void main(String[] args) {
		WildcardMatching w = new WildcardMatching();
		System.out.println(w.isMatch("aabcdfgr","a?b*r"));
	}
	
	private boolean isMatch(String realString, String pattern) {
		
		if(realString.length()==0)
			return pattern.length()==0;
		
		int j=0;
		for(int i=0; i<realString.length(); i++) {
			if(j<pattern.length() && pattern.charAt(j)=='*')  {
			  //j++;	
			  continue;
			} else if(j<pattern.length()&&pattern.charAt(j)!='?' && realString.charAt(i) != pattern.charAt(j)){
				return false;
			}else if(j<pattern.length()&&pattern.charAt(j) == '?' || realString.charAt(i) == pattern.charAt(j)){
				 j++;
				 if(j>realString.length())
					 return false;
				 continue;
			}

		}
		
		return true;
	}
	
	
	public  boolean isMatch1(String s, String p) {
		int i = 0;
		int j = 0;
		int starIndex = -1;
		int iIndex = -1;
	 
		while (i < s.length()) {
			if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
				++i;
				++j;
			} else if (j < p.length() && p.charAt(j) == '*') {
				starIndex = j;		
				iIndex = i;
				j++;
			} else if (starIndex != -1) {
				j = starIndex + 1;
				i = iIndex+1;
				iIndex++;
			} else {
				return false;
			}
		}	 
		while (j < p.length() && p.charAt(j) == '*') {
			++j;
		}
		return j == p.length();
	}
	
}
