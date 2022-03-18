package array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class IntersectionOfArrays {

	   static  public int[] intersect(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        Queue<Integer> l = new LinkedList<Integer>();
	        
	        for(int i=0; i<nums1.length; i++){
	            if(map.containsKey(nums1[i]))
	              map.put(nums1[i], map.get(nums1[i])+1);
	            else
	               map.put(nums1[i], 1);
	        }
	        
	        for(int i=0; i<nums2.length; i++){
	            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
	                l.add(nums2[i]);
	                map.put(nums2[i], map.get(nums2[i])-1);
	            }
	        }
	        
	        int[] output = new int[l.size()];
	        int i = 0;
	        while(!l.isEmpty()){
	            output[i++] = l.poll();
	        }
	        
	        return output;
	        
	    }
	    
  public static void main(String a[]) {
	  intersect(new int[] {1,2,2,1}, new int[] {2,2,2,3});
  }
}


