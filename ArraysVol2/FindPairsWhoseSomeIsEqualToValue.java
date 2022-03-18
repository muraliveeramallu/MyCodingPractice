package ArraysVol2;

import java.util.*;

/*
 You have given an integer array and a number, 
 you need to write a program to find all elements in the array whose sum is equal to the given number. 
 Remember, the array may contain both positive and negative numbers, so your solution should consider that.
 */
public class FindPairsWhoseSomeIsEqualToValue {

	public static void main(String a[]) {
		getPairs(new int[] { 4, 5, 4, 3, 6, 2, 9, -1, 7, 11, 12, 1 }, 8);// o/p (4,4) (5,3), (6,2),(9,-1),(7,1)
		getPairs(new int[] { 12, 13, -4, 15, 6, 3, 9, -2, 7, 11 }, 8);
		getPairsUsingSet(new int[] { 4, 5, 4, 3, 6, 2, 9, -1, 7, 11, 12, 1 }, 8);// o/p (4,4) (5,3), (6,2),(9,-1),(7,1)
		getPairsUsingSet(new int[] { 12, 13, -4, 15, 6, 3, 9, -2, 7, 11 }, 8);
	}

	private static Map getPairs(int[] a, int n) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (pairs.containsKey(n - a[i])) {
				pairs.put(a[i], n - a[i]);
			} else {
				pairs.put(a[i], null);
			}
		}

		for (Map.Entry<Integer, Integer> m : pairs.entrySet()) {
			if (m.getValue() != null)
				System.out.print("(" + m.getKey() + "," + m.getValue() + ")");
		}

		return pairs;
	}

	private static void getPairsUsingSet(int[] a, int n) {
		Set<Integer> values = new HashSet<Integer>();
		int target = 0;
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			target = n - a[i];
			if (!values.contains(target)) {
				values.add(a[i]);
			} else {
				System.out.print("(" + target + "," + a[i] + ")");
			}

		}
	}

	public static void printPairsUsingTwoPointers(int[] numbers, int k) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}
	}

}
