package ArraysVol2;

import java.util.*;

/*Given an array of integers, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence 
is smallest.*/
public class FirstReaptingFirstIdexValue {
	public static void main(String a[]) {
		firtsRepeatingFirstIndex(new int[] { 10, 5, 3, 4, 3, 5, 6 });
		printFirstRepeating(new int[] { 10, 5, 3, 4, 3, 5, 6 });
	}

	private static void firtsRepeatingFirstIndex(int[] a) {
       Map<Integer, Integer> treeMap = new LinkedHashMap<Integer,Integer>();
       
       for(int i=0; i<a.length; i++) {
    	  if(treeMap.containsKey(a[i]))
    	     treeMap.put(a[i], treeMap.get(a[i])+1);
    	   else 
    		   treeMap.put(a[i], 1); 
       }
       
       for(Map.Entry<Integer, Integer> map : treeMap.entrySet()) {
    	   if(map.getValue()>1) {
    		   System.out.println(map.getKey());
    		   break;
    	   }
       }
	}
	
	 static void printFirstRepeating(int arr[]) 
	    { 
	        // Initialize index of first repeating element 
	        int min = -1; 
	  
	        // Creates an empty hashset 
	        HashSet<Integer> set = new HashSet<>(); 
	  
	        // Traverse the input array from right to left 
	        for (int i=arr.length-1; i>=0; i--) 
	        { 
	            // If element is already in hash set, update min 
	            if (set.contains(arr[i])) 
	                min = i; 
	  
	            else   // Else add element to hash set 
	                set.add(arr[i]); 
	        } 
	  
	        // Print the result 
	        if (min != -1) 
	          System.out.println("The first repeating element is " + arr[min]); 
	        else
	          System.out.println("There are no repeating elements"); 
	    } 
}
