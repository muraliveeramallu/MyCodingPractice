package ArraysVol2;
/*Here you have to find the contiguous sub-array within an array (containing at least one number) which has the largest sum.

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6. 
*/
public class SubArrayOfMaximumSumOfContigousNumbers {
	
	public static void main(String a[]) {
		getSubArrayOfMaximumSum(new int[]{2,1,-3,4,-1,2,1,-5,4});
	}

	private static void getSubArrayOfMaximumSum(int[] a) {
		
		int max = 0, sum = 0;
		int start = 0, end = 0, s=0;
		for(int i = 0; i<a.length;i++) {
			sum += a[i];
			if(max<sum) {
				max = sum;
				start = s;
				end = i;
			}
			
			if(sum<0) {
				sum = 0;
				s = i+1;
			}
		}
		System.out.println("Max Sum "+max);
		for(int i = start; i<=end;i++) {
			System.out.print(a[i]+" ");
			
		}
	}

}
