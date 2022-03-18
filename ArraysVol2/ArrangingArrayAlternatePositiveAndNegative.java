package ArraysVol2;

import java.util.*;

public class ArrangingArrayAlternatePositiveAndNegative {

	public static void main(String[] args) {
		alternate(new int[] {1, 2, 3, -4, -1, 4});
		alternate(new int[] {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8});
	}

	private static List alternate(int[] a) {
		Queue<Integer> positive = new LinkedList<Integer>();
		Queue<Integer> negative = new LinkedList<Integer>();
		
		List<Integer> output = new LinkedList<Integer>();
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]<0)
				negative.add(a[i]);
			else
				positive.add(a[i]);
		}
		
		for(int i = 0; i<a.length;i++) {
			if(negative.size() != 0)
				output.add(negative.poll());
			if(positive.size() != 0)
				output.add(positive.poll());
		}
		
		return output;
		
	}

}
