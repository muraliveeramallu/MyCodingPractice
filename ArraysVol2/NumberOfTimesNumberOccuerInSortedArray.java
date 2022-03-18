package ArraysVol2;

import java.util.*;

/*
    Implement a function to find how many times a number occurs in a sorted array.  
    For instance, the output is 4 when the inputs are an array {1, 2, 3, 3, 3, 3, 4, 5} and the number 3 because 3 occurs 4 times in the given array.
 */
public class NumberOfTimesNumberOccuerInSortedArray {
	public static void main(String a[]) {
		System.out.println(numberOfTimesNumberOccured(new int[] {1,2,3,3,3,3,3,4,4,5},0));
		System.out.println(numberOfTimesNumberOccured2(new int[] {1,2,3,3,3,3,3,4,4,5},0));
	}
	public static int numberOfTimesNumberOccured(int[] a, int num) {
		int count = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< a.length;i++) {
			if(m.containsKey(a[i])) {
				int val = m.get(a[i]);
				m.put(a[i], val+1);
			} else {
				m.put(a[i], 1);
			}
		}
		
		return m.containsKey(num)?m.get(num):0;
		
	}
	
	public static int numberOfTimesNumberOccured2(int[] a, int num) {
		int count = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i = 0; i< a.length;i++) {
			if(a[i] == num) {
				count++;
			}
		}
		
		return count;
		
	}

}
