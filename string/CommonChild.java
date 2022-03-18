package string;

import java.util.HashMap;
import java.util.Map;

public class CommonChild {

	public static void main(String[] args) {
		CommonChild c = new CommonChild();
		//System.out.println(c.longestCommonSubsequence("SALLY","HARRY"));
		System.out.println(c.longestCommonSubsequence("SHINCHAN","NOHARAAA"));
		System.out.println(c.longestCommonSubsequence("ABCDEF","FBDAMN"));
		//System.out.println(c.longestCommonSubsequence("AA","BB"));
	}

	public static int longestCommonSubsequence(String a, String b) {
		int ans = 0;
		int n = a.length();
		int L[][] = new int[n + 1][n + 1];
		int i, j;

		for (i = 0; i <= n; i++) {
			for (j = 0; j <= n; j++) {
				if (i == 0 || j == 0)
					L[i][j] = 0;

				else if (a.charAt(i - 1) == b.charAt(j - 1))
					L[i][j] = L[i - 1][j - 1] + 1;

				else
					L[i][j] = maximum(L[i - 1][j], L[i][j - 1]);
			}
		}

		return L[n][n];
	}

	public static int maximum(int a, int b) {
		if (a >= b)
			return a;
		return b;
	}


}

//"SALLY","HARRY"

//L[0][0] = 0
/*
 public class LongestCommonSubsequence 
{ 
  
  // Returns length of LCS for X[0..m-1], Y[0..n-1] 
  int lcs( char[] X, char[] Y, int m, int n ) 
  { 
    if (m == 0 || n == 0) 
      return 0; 
    if (X[m-1] == Y[n-1]) 
      return 1 + lcs(X, Y, m-1, n-1); 
    else
      return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n)); 
  } 
  
  // Utility function to get max of 2 integers 
  int max(int a, int b) 
  { 
    return (a > b)? a : b; 
  } 
  
  public static void main(String[] args) 
  { 
    LongestCommonSubsequence lcs = new LongestCommonSubsequence(); 
    String s1 = "AGGTAB"; 
    String s2 = "GXTXAYB"; 
  
    char[] X=s1.toCharArray(); 
    char[] Y=s2.toCharArray(); 
    int m = X.length; 
    int n = Y.length; 
  
    System.out.println("Length of LCS is" + " " + 
                                  lcs.lcs( X, Y, m, n ) ); 
  } 
  
} */

