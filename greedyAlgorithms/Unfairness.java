package greedyAlgorithms;

import java.util.Arrays;

public class Unfairness {

	public static void main(String[] args) {
		Unfairness u = new Unfairness();
		System.out.println(u.minUnfairness(new int[] {10,100,300,200,1000,20,30}, 3));
		System.out.println(u.minUnfairness(new int[] {2,1,2,1,2,1}, 2));
		System.out.println(u.minUnfairness(new int[] {2,1,2,1,2,1}, 3));
	}

	private int minUnfairness(int[] a, int k) {
		Arrays.sort(a);
		
		return a[k-1]-a[0];
	}
	
	private int minUnfairness1(int[] a, int k) {
		Arrays.sort(a);
		 int[] u = new int[a.length-k+1];

        for (int i = 0; i < a.length-k+1; ++i) u[i] = a[i+k-1] - a[i];
        Arrays.sort(u);
        return u[0];
	}

}
