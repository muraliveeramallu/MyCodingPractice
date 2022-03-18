package string;
/*
 Question 1: https://www.geeksforgeeks.org/print-concatenation-of-zig-zag-string-form-in-n-rows/
  Input: str = "GEEKSFORGEEKS"
       n = 3
Output: GSGSEKFREKEOE
Explanation: Let us write input string in Zig-Zag fashion
             in 3 rows.
G       S       G       S
  E   K   F   R   E   K
    E       O       E
Now concatenate the two rows and ignore spaces 
in every row. We get "GSGSEKFREKEOE"

Question 2:
https://leetcode.com/problems/zigzag-conversion/

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Explanation:

P   A   H   N
A P L S I I G
Y   I   R

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 */

public class ZigZapString1 {

	public static void main(String[] args) {
		System.out.println(getZigZagString("PAYPALISHIRING",3));

	}

	private static String getZigZagString(String str, int n) {
		String[] s = new String[n];
		String output = "";
		int direction = -1;
		int row = 0;
		
		for(int i = 0; i<str.length();i++) {
			s[row] = s[row]+str.charAt(i);
			if(row+1 == n)
				direction = 1;
			if(row-1 < 0)
				direction = -1;
			if(direction == -1)
				row = row+1;
			else
				row = row-1;
			
		}
		
		for(int i = 0; i<s.length;i++) {
			output = output+s[i];
		}
		
		return output.replace("null", "");
	}
 
}
