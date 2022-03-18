package Leeth;

import java.util.ArrayList;
import java.util.List;

public class SkuLineProblem {
	
	public static void main(String a[]) {
		List<int[]> skyLineValues = getSkyline(new int[][] {{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}});
	}

	public static List<int[]> getSkyline(int[][] buildings) {
	    List<List<List<Integer>>> indSetBlocksList = new ArrayList<>();
	    List<List<Integer>> sameSetBlocks = new ArrayList<>();
	    List<Integer> eachBlock = new ArrayList<>();
	    boolean newSet = false;
	    if(buildings.length == 0) {
	    	System.out.println("Sorry No Buildings");
	    }
	    for(int i = 0; i<=buildings.length-1;i++) {
	    	eachBlock = new ArrayList<>();
	    	if(i==0 || newSet) {
	    		sameSetBlocks = new ArrayList<>();
	    	}
	    	if(i==0) {
	    		eachBlock.add(0,buildings[i][0]);
	    		eachBlock.add(1,buildings[i][1]);
	    		eachBlock.add(2,buildings[i][2]);
	    		sameSetBlocks.add(eachBlock);
	    		continue;
	    	}
	    	
	    	if(buildings[i][0] <= buildings[i-1][1]) {
	    		eachBlock.add(0,buildings[i][0]);
	    		eachBlock.add(1,buildings[i][1]);
	    		eachBlock.add(2,buildings[i][2]);
	    		sameSetBlocks.add(eachBlock);
	    	} else {
	    		indSetBlocksList.add(sameSetBlocks);
	    		sameSetBlocks = new ArrayList<>();
	    		eachBlock = new ArrayList<>();
	    		eachBlock.add(0,buildings[i][0]);
	    		eachBlock.add(1,buildings[i][1]);
	    		eachBlock.add(2,buildings[i][2]);
	    		sameSetBlocks.add(eachBlock);
	    		continue;
	    	}
	    	
	    	if(i==buildings.length-1)
	    		indSetBlocksList.add(sameSetBlocks);
	    	
	    }
	    
	    for(int i=0; i<=indSetBlocksList.size()-1; i++) {
	    	calculateEachBlock(indSetBlocksList.get(i));
	    }
	    
		return new ArrayList<int[]>();
	}

	private static void calculateEachBlock(List<List<Integer>> list) {
		
		
	}
}
