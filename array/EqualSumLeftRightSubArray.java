package array;

//Find the index at which the sum of left half of array is  equal to the right half.

public class EqualSumLeftRightSubArray {
	
	public static int indexOfCutLeftRight(int[] arr) {
		int rightSum = 0;
		int leftSum = 0;
		
		for(int i = 0; i<arr.length;i++) {
			rightSum = rightSum + arr[i];
		}
		for(int i = 0; i<arr.length;i++) {
			rightSum = rightSum-arr[i];
			if(leftSum == rightSum){
				return i;
			}
			leftSum = leftSum+arr[i];
			
		}
		
		return -1;
		
	}
	
	public static int indexOfCutLeftRight2(int[] arr) {
		int rightSum = 0;
		int leftSum = 0;
		int j = arr.length-1;
		for(int i = 0; i<arr.length;) {
			if(i==0 || leftSum==rightSum ) {
			leftSum = leftSum + arr[i];
			rightSum = rightSum + arr[j];
			j--;
			i++;
			} else if(leftSum < rightSum ) {
				leftSum = leftSum + arr[i];
				i++;
			} else if(rightSum < leftSum ) {
				rightSum = rightSum + arr[j];
				j--;
			}
			
			if(i==j && rightSum == leftSum) {
				return i;
			}
			
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println(indexOfCutLeftRight2(new int[] {2,1,2,2,2,3,2,2,2,1,2}));
   System.out.println(indexOfCutLeftRight2(new int[] {1,4,2,5}));
	}

}
