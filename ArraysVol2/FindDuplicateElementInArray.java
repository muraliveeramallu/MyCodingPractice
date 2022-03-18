package ArraysVol2;

import java.util.*;

public class FindDuplicateElementInArray {

	public static void main(String a[]) {
		System.out.println(getDuplicateValue(new int[] {1,2,3,6,5,3}));;
		System.out.println(getDuplicateValueWithOutCollections(new int[] {1,2,3,6,5,3}));;
	}
//Using Collections
	private static int getDuplicateValue(int[] a) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0 ; i<a.length;i++) {
			if(set.contains(a[i])) {
				return a[i];
			}
			set.add(a[i]);
		}
		
		return 0;
	}
//WithoutUsing Collections
	private static int getDuplicateValueWithOutCollections(int[] a) {
		Arrays.sort(a);
		int prev = a[0];
		for(int i = 1 ; i<a.length;i++) {
			if(prev == a[i]) {
				return prev;
			} else {
				prev = a[i];
			}
		}
		
		return 0;
	}
}
