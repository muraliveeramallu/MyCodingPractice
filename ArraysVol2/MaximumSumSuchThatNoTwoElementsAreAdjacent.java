package ArraysVol2;
/*Given an array of positive numbers, find the maximum sum of a subsequence with 
 * the constraint that no 2 numbers in the sequence should be adjacent in the array. So 3 2 7 10
 *  should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5 and 7).
 */
public class MaximumSumSuchThatNoTwoElementsAreAdjacent {

	public static void main(String[] args) {
		System.out.println(getMaximumSumSuchThatNoTwoElementsAreAdjacent(new int[] {3,2,5,10,8}));
		System.out.println(getMaximumSumSuchThatNoTwoElementsAreAdjacent(new int[] {3,2,7,10}));
	}

	private static int getMaximumSumSuchThatNoTwoElementsAreAdjacent(int[] arr) {
		int in = arr[0];
		int ex = 0;
		int ex_new = 0;
		
		
		for(int i = 1; i<arr.length;i++) {
			
			ex_new = in>ex?in:ex;
			
			in = ex+arr[i];
			ex = ex_new;
		}
	
		return in>ex?in:ex;
		
	}

}
