package ArraysVol2;

import java.util.Arrays;
import java.util.*;

public class LongestConsequitiveSequenceInArray {
	public static void main(String a[]) {
		longestConsequitiveArray(new int[] {100, 4, 200, 1, 5, 2,6,7,201,202,203,204,2000,20001});
	}

	private static void longestConsequitiveArray(int[] a) {
		Arrays.sort(a);
        ArrayList<Integer> output = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        //temp.add(a[0]);
		for(int i=1; i<a.length;i++) {
			if(a[i] == a[i-1]+1) {
			temp.add(a[i-1]);
			} else {
				temp.add(a[i-1]);
				if(temp.size()>output.size()) {
					output = new ArrayList<Integer>(temp);
				}
				temp.clear();
			}
		}
		temp.add(a[a.length-1]);
		if(temp.size()>output.size()) {
			output = new ArrayList<Integer>(temp);
		}
		for(int i = 0; i<output.size();i++) {
			System.out.print(output.get(i)+" ");
			
		}
	}

}


//1,2,5,7,8,9
