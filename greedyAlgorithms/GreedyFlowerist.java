package greedyAlgorithms;
//https://www.hackerrank.com/challenges/greedy-florist/problem
import java.util.Arrays;

public class GreedyFlowerist {
	
	public static void main (String a[]) {
		GreedyFlowerist g = new GreedyFlowerist();
		System.out.println(g.getMinSpent(new int[] {1,3,5,7,9}, 3));
		System.out.println(g.getMinSpent(new int[] {1,3,5,7,9,2,6,4,10,8,11,12}, 2));
		

	}

	private int getMinSpent(int[] a, int c) {
		
		Arrays.sort(a);
		int sum = 0;
		int multiple = 1;
		int k=a.length;
		
		for(int i=a.length; i>0;i--) {
			if(c==k) {
				sum=sum+a[i-1];
				continue;
			}
				
			if( i-c<i)
			{
				sum=sum+a[i-1];
				continue;
			}
			
			if((k-c)>0) {
				if(multiple>c)
					multiple++;
				sum = sum + (multiple+1)*a[i-1];
				
			}
			
		}
		
		return sum;
		
	}

}