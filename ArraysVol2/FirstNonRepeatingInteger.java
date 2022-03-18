package ArraysVol2;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingInteger {
	public static void main(String a[]) {
		getNonRepeatingChar(new int[]{10, 5, 3, 4, 3, 5, 6});
	}

		private static void getNonRepeatingChar(int[] a) {
		       Map<Integer, Integer> treeMap = new LinkedHashMap<Integer,Integer>();
		       
		       for(int i=0; i<a.length; i++) {
		    	  if(treeMap.containsKey(a[i]))
		    	     treeMap.put(a[i], treeMap.get(a[i])+1);
		    	   else 
		    		   treeMap.put(a[i], 1); 
		       }
		       
		       for(Map.Entry<Integer, Integer> map : treeMap.entrySet()) {
		    	   if(map.getValue()==1) {
		    		   System.out.println(map.getKey());
		    		   break;
		    	   }
		       }
			}
	}


