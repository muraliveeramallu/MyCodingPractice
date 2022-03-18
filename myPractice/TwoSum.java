package myPractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum t = new TwoSum();
		int[] result = t.twoSum(new int[] {1,3,4,5,8}, 5);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
	
	 public int[] twoSum(int[] nums, int target) {
		 int expected = 0;
		 Map<Integer, Integer> resultMap = new  HashMap<Integer, Integer> ();
		for(int i=0;i<nums.length;i++) {
			expected = target - nums[i];
			
			if(resultMap.containsKey(expected)) {
				return new int[] {resultMap.get(expected),i};
			}
			
			resultMap.put(nums[i], i);
		}	
		
		 throw new IllegalArgumentException("No two sum solution");
	 }

}
