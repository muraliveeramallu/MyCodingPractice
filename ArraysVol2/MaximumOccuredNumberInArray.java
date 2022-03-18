package ArraysVol2;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumOccuredNumberInArray {
	
	public static void main(String a[]) {
		//maximumOccuredNumberInArray(new int[] {1,2,3,3,3,3,4,5,5,6,6});
		maximumOccuredNumberInArray2(new int[] {1,1,1,1,1,1,1,2,3,3,3,3,4,5,5,6,6});
	}
	
	public static void maximumOccuredNumberInArray(int[] a) {
		
	  Map<Integer,Integer> map = new HashMap<Integer,Integer>();	
	   
	  for(int i = 0; i< a.length; i++) {
		  if(map.containsKey(a[i])) {
			  int c = map.get(a[i]);
			  map.put(a[i], c+1);
		  } else {
			  map.put(a[i], 0);
		  }
		  
	  }
	  
	  map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toMap(
			  Map.Entry<Integer, Integer>::getKey, Map.Entry<Integer, Integer>::getValue,
			  (oldValue,NewValue) -> oldValue, LinkedHashMap::new)).forEach((k,v) -> System.out.println("Number "+k+" occurance"+v)) ;
	  
		
	}
	
	public static void maximumOccuredNumberInArray2(int[] a) {
		
		   int maxOccur = a[0];
		   int maxOccurance = 1;
		   int count = 1;
		  for(int i = 1; i< a.length; i++) {
			if(a[i-1] == a[i]) {
				count = count+1;
			} else {
				if(count>maxOccurance) {
					maxOccur = a[i-1];
					maxOccurance = count;
				}
				count = 1;
			}
			  
		  }
		  
			System.out.println(maxOccur+" is occured "+maxOccurance+" times");
		}

}
