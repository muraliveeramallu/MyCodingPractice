package greedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {

	public static void main(String[] args) {
		LuckBalance l = new LuckBalance();
		System.out.println(l.getMaxLuckBalance(new int[][]{{5,1},
									  {2,1},
									  {1,1},
									  {8,1},
									  {10,0},
									  {5,0}},3));
	}

	private int getMaxLuckBalance(int[][] a, int k) {
		  List<Integer> ar = new ArrayList<Integer>();
	        int ans = 0;
	        for(int i=0; i<a.length; i++) {
	            int val = a[i][0];
	            int imp = a[i][1];
	            if(imp == 0)
	                ans += val;
	            else
	                ar.add(val);
	        }
	        Collections.sort(ar, Collections.reverseOrder());
	        for(int i=0; i<ar.size(); i++) {
	            if(i < k)
	                ans += ar.get(i);
	            else
	                ans -= ar.get(i);
	        }
	        
	        return ans;
	}

}
