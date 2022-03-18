package string;
/*
 * https://www.geeksforgeeks.org/longest-common-substring-dp-29/
 * Given two strings ‘X’ and ‘Y’, find the length of the longest common substring.
Input : X = "abcdxyz", y = "xyzabcd"
Output : 4
The longest common substring is "abcd" and is of
length 4.
 */
public class LongestCommonSubString {

	public static void main(String[] args) {
		//String X = "OldSite:GeeksforGeeks.org"; 
       // String Y = "NewSite:GeeksQuiz.com"; 
        
       // String X = "Oldshdefgh"; 
        //String Y = "Newshidefgh";
		
		 String X = "SALLY"; 
	     String Y = "HARRY";
  
        int m = X.length(); 
        int n = Y.length(); 
  
        System.out.println("Length of Longest Common Substring is "
                + LCSubStr(X.toCharArray(), Y.toCharArray(), m, n)); 
    }

	static int LCSubStr(char X[], char Y[], int m, int n)  
    { 
        // Create a table to store lengths of longest common suffixes of 
        // substrings. Note that LCSuff[i][j] contains length of longest 
        // common suffix of X[0..i-1] and Y[0..j-1]. The first row and 
        // first column entries have no logical meaning, they are used only 
        // for simplicity of program 
        int LCStuff[][] = new int[m + 1][n + 1]; 
        int result = 0;  // To store length of the longest common substring 
          
        // Following steps build LCSuff[m+1][n+1] in bottom up fashion 
        for (int i = 0; i <= m; i++)  
        { 
            for (int j = 0; j <= n; j++)  
            { 
                if (i == 0 || j == 0) 
                    LCStuff[i][j] = 0; 
                else if (X[i - 1] == Y[j - 1]) 
                { 
                    LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1; 
                    result = Integer.max(result, LCStuff[i][j]); 
                }  
                else
                    LCStuff[i][j] = 0; 
            } 
        } 
        return result; 
    } 

}
/*
 * class GFG { 
  
    static String X, Y; 
// Returns length of function for longest common  
// substring of X[0..m-1] and Y[0..n-1]  
    static int lcs(int i, int j, int count) { 
  
        if (i == 0 || j == 0) { 
            return count; 
        } 
  
        if (X.charAt(i - 1) == Y.charAt(j - 1)) { 
            count = lcs(i - 1, j - 1, count + 1); 
        } 
        count = Math.max(count, Math.max(lcs(i, j - 1, 0), 
                            lcs(i - 1, j, 0))); 
        return count; 
    } 
// Driver code  
    public static void main(String[] args) { 
        int n, m; 
        X = "abcdxyz"; 
        Y = "xyzabcd"; 
  
        n = X.length(); 
        m = Y.length(); 
  
        System.out.println(lcs(n, m, 0)); 
    } 
} 
// This code is contributed by Rajput-JI  
 * (
 * */
