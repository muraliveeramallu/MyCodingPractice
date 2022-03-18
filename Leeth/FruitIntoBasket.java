package Leeth;

import java.util.HashMap;

public class FruitIntoBasket {
	
	public static void main(String a[]) {
		System.out.println(getMaxFruits1(new int[] {3,3,3,1,2,1,1,2,3,3,4}));
		System.out.println(getMaxFruits1(new int[] {0,1,2,2}));
		System.out.println(getMaxFruits1(new int[] {1,2,3,2,2}));
		System.out.println(getMaxFruits1(new int[] {1,0,1,4,1,4,1,2,3})); 
		System.out.println(getMaxFruits1(new int[] {0,1,6,6,4,4,6}));
		
	}

	private static int getMaxFruits(int[] tree) {
		// TODO Auto-generated method stub
		int basketA = -1;
		int basketB = -1;
		int basketACount = 0;
		int basketBCount = 0;
		int max = 0;
		for(int i = 0 ; i < tree.length; i++) {
			if(basketA == -1 && basketB == -1) {
				basketA = tree[i];
			    basketACount = basketACount + 1;
			    max = Math.max(max, basketACount+basketBCount);
			    continue;
			}
			if(basketA != tree[i]  && basketB == -1) {
				basketB = tree[i];
			    basketBCount = basketBCount + 1;
			    max = Math.max(max, basketACount+basketBCount);
			    continue;
			}
			if(basketA == tree[i]) {
				 basketACount = basketACount + 1;
			}
            if(basketB == tree[i]) {
            	basketBCount = basketBCount + 1;
			}
            if(basketA != tree[i] && basketB != tree[i]){
            	max = Math.max(max, basketACount+basketBCount);
            	basketA = tree[i-1];
            	basketB = tree[i];
            	basketACount = basketBCount;
            	basketBCount = 1;
            }
            max = Math.max(max, basketACount+basketBCount);
		}
		
		return max;
		
	}
	
	private static int getMaxFruits1(int[] tree) {
		// TODO Auto-generated method stub
		if(tree == null || tree.length == 0)
			return 0;
		int max = 0;
		int s = 0;
		int e = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<tree.length;i++) {
			int a = tree[i];
			map.put(a, map.getOrDefault(a, 0)+1);
			e++;
			while(map.size()>2) {
				int a1 = tree[s];
				if(map.get(a1)>1) {
					map.put(a1,map.get(a1)-1);
					s++;
				} else {
					map.remove(a1);
					s++;
				}
				
			}
			max = Math.max(max, e-s);
			
		}
		
		return Math.max(max, e-s);
	}

}
