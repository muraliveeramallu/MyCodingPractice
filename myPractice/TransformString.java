package myPractice;

import java.util.HashMap;
import java.util.Map;

public class TransformString {

	public static void main(String[] args) {
		TransformString t = new TransformString();
		System.out.println(t.minOps("abcd", "cdba"));
	} 
	

	 public int minOps(String A, String B) 
	    { 
		 
	        if(A.length() != B.length()) 
	            return -1; 
	          
	        int i, j, res = 0; 
	          
	        i = A.length()-1; 
	        j = B.length()-1; 
	  
	        while(i >= 0) 
	        { 
	            // If there is a mismatch, then  
	            // keep incrementing result 'res' 
	            // until B[j] is not found in A[0..i] 
	            if(A.charAt(i) != B.charAt(j)) 
	                res++; 
	            else
	                j--; 
	            i--;          
	        } 
	        return res;      
	    } 

}
