package greedyAlgorithms;

import java.util.Arrays;

public class MinimumAbsoluteDiff {
	
	public static void main(String a[]) {
		MinimumAbsoluteDiff m =  new MinimumAbsoluteDiff();
		System.out.println(m.getMinimumAbsDifference(new int[] {3,-7,0}));
		System.out.println(m.getMinimumAbsDifference(new int[] {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}));
		System.out.println(m.getMinimumAbsDifference(new int[] {1, -3, 71, 68, 17}));
	}

	private int getMinimumAbsDifference(int[] a) {
		Arrays.sort(a);
		int[] differences = new int[a.length-1];
		for(int i = 0 ; i<a.length-1;i++) {
			differences[i] = getDifference(a[i],a[i+1]);
		}
		Arrays.sort(differences);
		return differences[0];
	}

	private int getDifference(int i, int j) {
		// TODO Auto-generated method stub
		int sum = i-j;
		return Math.abs(sum);
	}
	

}
