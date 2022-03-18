package ArraysVol2;

import java.util.Arrays;

public class kThSmallestAndLargestElementInArray {

	public static void main(String[] args) {
		KthSmallestAndLArgest(new int[] {5,3,10,12,4,1,8,17,6,18},3);
		KthSmallestAndLArgest(new int[] {5,3,10,12,17,6,18},4);
		KthSmallestAndLArgestWithSort(new int[] {5,3,10,12,4,1,8,17,6,18},3);
		KthSmallestAndLArgestWithSort(new int[] {5,3,10,12,17,6,18},4);

	}

	private static void KthSmallestAndLArgestWithSort(int[] a, int n) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int minCount = 0;
		int maxCount = 0;
		
		for(int i = 0; i<a.length;i++) {
			if(minCount == n && maxCount == n) {
				break;
			}
			if(a[i]>max && maxCount != n) {
				max = a[i];
				maxCount++;
			}
			if(a[i]<min && minCount != n) {
				min = a[i];
				minCount++;
			}
		}
		
		System.out.println("max="+max+" min="+min);
		
	}

	private static void KthSmallestAndLArgest(int[] a, int n) {
	Arrays.sort(a);
	for(int i = 0; i<a.length;i++) {
		if(i == n-1) {
			System.out.println("Min="+a[i]);
			break;
		}
		
	}
	for(int j = a.length-1; j>=0;j--) {
		n--;
		if(n==0) {
			System.out.println("Max="+a[j]);
		}
		
	}
		
	}

}
