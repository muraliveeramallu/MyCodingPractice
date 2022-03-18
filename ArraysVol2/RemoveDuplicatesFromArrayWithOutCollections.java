package ArraysVol2;

import java.util.*;

public class RemoveDuplicatesFromArrayWithOutCollections {

	public static void main(String[] args) {
		removeDuplicates(new int[] {6,7,6,5,4,3,2,3,4,9});

	}

	private static List<Integer> removeDuplicates(int[] a) {
		Arrays.sort(a);
		List<Integer> removedDuplicates = new ArrayList<Integer>();
		int value = a[0];
		for(int i = 1; i< a.length;i++) {
			if(value != a[i]) {
				removedDuplicates.add(a[i]);
			}
			
			value = a[i];
			
		}
		
		return removedDuplicates;
	}

}
