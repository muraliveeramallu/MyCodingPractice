package ArraysVol2;

public class SmallestSumContiguousSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 3, -4, 2, -3, -1, 7, -5 };
		//int arr[] = {2, 6, 8, 1, 4};
		//int arr[] = {2, 6, 8, 1, 4};
		int n = arr.length;

		System.out.print("Smallest sum: " + smallestSumSubarr(arr, n));

	}

	private static int smallestSumSubarr(int[] arr, int n) {
		int smallestSum = arr[0];
		int sum = 0;
		int start = 0, end = 0;
		while (end < n) {

			sum += arr[end++];

			if (sum > smallestSum) {
				sum -= arr[start++];
				smallestSum = Math.min(smallestSum, sum);
			} else {
				smallestSum = Math.min(smallestSum, sum);
			}
		}

		return smallestSum;

	}

}
