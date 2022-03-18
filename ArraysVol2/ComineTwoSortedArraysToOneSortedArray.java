package ArraysVol2;

import java.util.*;

public class ComineTwoSortedArraysToOneSortedArray {

	public static void main(String[] args) throws Exception {
		int[] a = new int[] {1,3,4,5,6,17,18};
		int[] b = new int[] {2,8,10};
		int [] c = mergetwoSortedArrays(a,b);
		  for(int  i = 0; i< c.length; i++) {
		    System.out.println(c[i]+" ");
		  }
	}

	private static int[] mergetwoSortedArrays(int[] a, int[] b) throws Exception {
		Queue q = new LinkedList();
		if(a == null && b == null)
			throw new Exception("Both Arrays Null");
		if((a == null || a.length==0) && b != null)
			return b;
		if((b == null || b.length == 0) && a != null)
			return a;
		
	  int length = a.length + b.length;
      int[] c = new int[length];
      int k = 0, l = 0;

      for(int  i = 0; i< c.length; i++) {
    	  if(k>=a.length) {
    		  c[i] = b[l];
    		  l++;
    		  continue;
    	  }
    	  
    	  if(l>=b.length) {
    		  c[i] = a[k];
    		  k++;
    		  continue;
    	  }
    		  
    	  if(k<a.length && l<b.length && a[k] <= b[l]) {
    		  c[i] = a[k];
    		  k++;
    	  } else {
    		  c[i] = b[l];
    		  l++;
    	  }
      }
      
      return c;
		
	}

}
