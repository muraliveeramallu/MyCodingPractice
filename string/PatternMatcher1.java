package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcher1 {

	public static void main(String a[]) {

		System.out.println(solve("aacbbbdac", "a*b*ac"));
	}

	private static boolean isMatch(String string, String pattern) {
		/*
		 * Pattern p = Pattern.compile(pattern); Matcher m = p.matcher(string); if
		 * (m.find( )) { System.out.println("Found value: " + m.group(0) );
		 * System.out.println("Found value: " + m.group(1) );
		 * System.out.println("Found value: " + m.group(2) ); }else {
		 * System.out.println("NO MATCH"); }
		 */
		if (pattern.length() > string.length()) {
			return false;
		}
		int i = 0;
		int j = 0;
		while (pattern.length() - 1 > 0) {
			if (pattern.charAt(j) == string.charAt(i)) {
				i++;
				j++;
			} else if (pattern.charAt(j) == '.') {
				i++;
				j++;
			} else if (pattern.charAt(j) == '*') {
				if (pattern.charAt(j + 1) == string.charAt(i + 1)) {
					j++;
				}
				i++;
			} else {
				return false;
			}
			if (i == string.length() && j < pattern.length()) {
				return false;
			}

		}
		return true;
	}

	public static boolean isMatch2(String s, String p) {
		boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
		dp[0][0] = true;
		for (int j = 1; j <= p.length(); j++) {
			if (p.charAt(j - 1) == '*' && dp[0][j - 2]) {
				dp[0][j] = true;
			}
		}
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= p.length(); j++) {
				if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
					dp[i][j] = dp[i - 1][j - 1];
				} else if (p.charAt(j - 1) == '*') {
					if (p.charAt(j - 2) != s.charAt(i - 1) && p.charAt(j - 2) != '.') {
						dp[i][j] = dp[i][j - 2];
					} else {
						dp[i][j] = (dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j]);
					}
				}
			}
		}
		return dp[s.length()][p.length()];

	}
	
	 public static boolean solve(String text, String pattern) {
	        if (pattern.isEmpty()) return text.isEmpty();
	        boolean first_match = (!text.isEmpty() &&
	                               (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

	        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
	            return (isMatch(text, pattern.substring(2)) ||
	                    (first_match && isMatch(text.substring(1), pattern)));
	        } else {
	            return first_match && isMatch(text.substring(1), pattern.substring(1));
	        }
	    }

}
