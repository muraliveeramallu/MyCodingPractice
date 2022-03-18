package hrWarmUp;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SockMerchant s = new SockMerchant();

		System.out.println(s.getSockPairCount(7, new int[] { 1, 2, 1, 2, 1, 3, 2 }));
		System.out.println(s.getSockPairCount(3, new int[] { 1, 2, 3 }));
		System.out.println(s.getSockPairCount(13, new int[] { 1, 2, 1, 2, 1, 3, 3, 4, 4, 4, 4, 5, 2 }));

	}

	private int getSockPairCount(int n, int[] ar) {
		int pairCount = 0;

		if (n == 0 || n == 1)
			return pairCount;

		HashMap<Integer, Integer> sockMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (sockMap.containsKey(ar[i])) {
				int count = sockMap.get(ar[i]) + 1;
				sockMap.put(ar[i], count);
			} else
				sockMap.put(ar[i], 1);
		}

		for (Map.Entry<Integer, Integer> entry : sockMap.entrySet()) {
			pairCount += entry.getValue() / 2;
		}

		return pairCount;
	}

}
