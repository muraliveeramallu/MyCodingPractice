package ArraysVol2;

import java.util.Arrays;
import java.util.HashMap;

/*
Input: {4, 2, -3, 1, 6}
Output: true 
There is a sub-array with zero sum from index 1 to 3.
 * 
 * */
public class SubArrayWithSumZero {
 public static void main(String a[]) {
	 System.out.println(subArrayExists(new int[] {4, 2, -3, 1, 6}));
	 System.out.println(subArrayExists(new int[] {4, 2, -9 , 1, -4, 6}));//{4,6,-3,-2,4}
	 System.out.println(subArrayExists(new int[] {5, 2, -7, 1, 6}));//{5,7,0,1,7}
	 System.out.println(subArrayExists(new int[] {5, 2, -4, 1, -9, -8}));//{5,7,-3,-2,
	 System.out.println(subArrayExists(new int[] {4, 2, 0, 1, 6}));
 }

  static boolean subArrayExists(int arr[]) 
 { 
     // Creates an empty hashMap hM 
     HashMap<Integer, Integer> hM =  
                     new HashMap<Integer, Integer>(); 
       
     // Initialize sum of elements 
     int sum = 0;      
       
     // Traverse through the given array 
     for (int i = 0; i < arr.length; i++) 
     {  
         // Add current element to sum 
         sum += arr[i]; 
           
         // Return true in following cases 
         // a) Current element is 0 
         // b) sum of elements from 0 to i is 0 
         // c) sum is already present in hash map 
         if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)                          
             return true; 
           
         // Add sum to hash map 
         hM.put(sum, i); 
     }  
       
     // We reach here only when there is 
     // no subarray with 0 sum 
     return false; 
 }      
  
  static boolean subArrayWithSumZero(int arr[]) 
  { 
      // Creates an empty hashMap hM 
      HashMap<Integer, Integer> hM =  
                      new HashMap<Integer, Integer>(); 
        
      // Initialize sum of elements 
      int sum = 0;      
        
      // Traverse through the given array 
      for (int i = 0; i < arr.length; i++) 
      {  
          // Add current element to sum 
          sum += arr[i]; 
            
          // Return true in following cases 
          // a) Current element is 0 
          // b) sum of elements from 0 to i is 0 
          // c) sum is already present in hash map 
          if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)                          
              return true; 
            
          // Add sum to hash map 
          hM.put(sum, i); 
      }  
        
      // We reach here only when there is 
      // no subarray with 0 sum 
      return false; 
  }    
  
public int[] zeroSum(int[] arr) {
    HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();
 
    int sum = 0;
    for (int i = 0; i <= arr.length; i++) {
        Integer oldIndex = sums.get(sum);
        if (oldIndex == null && i == arr.length) {
            return null;
        } else if (oldIndex == null) {
            sums.put(sum, i);
            sum += arr[i];
        } else {
            return Arrays.copyOfRange(arr, oldIndex, i);
        }
    }
 
    return null;
}


}
