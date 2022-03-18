package hrWarmUp;

public class RepeatedString {

	// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

	public static void main(String[] args) {
		RepeatedString r = new RepeatedString();
		System.out.println(r.getCount("aba", 10));
		System.out.println(r.getCount("abca", 9));
		System.out.println(r.getCount("abca", 7));
		System.out.println(r.getCount("abca", 2));
		System.out.println(r.getCount("a", 100));
		System.out.println(r.getCount("abcada", 20));
		System.out.println("/");
		
		System.out.println(r.getCount1("aba", 10));
		System.out.println(r.getCount1("abca", 9));
		System.out.println(r.getCount1("abca", 7));
		System.out.println(r.getCount1("abca", 2));
		System.out.println(r.getCount1("a", 100));
		System.out.println(r.getCount1("abcada", 20));

	}

	private int getCount(String string, int n) {
		int occurCount = 0;
		int totalCount = 0;
		int mod = 0;
		if (n > string.length()) {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) == 'a') {
					occurCount++;
				}
			}
		} else {

			for (int i = 0; i < n; i++) {
				if (string.charAt(i) == 'a') {
					occurCount++;
				}
				return occurCount;
			}
		}

		mod = n % string.length();

		if (mod == 0) {
			return n;
		} else {
			totalCount = ((n - mod) / string.length()) * occurCount;
			for (int i = 0; i < mod; i++) {
				if (string.charAt(i) == 'a') {
					totalCount++;
				}
			}

		}
		return totalCount;
	}

	private int getCount1(String string, int n) {
		int num = n / string.length();
		int rem = n % string.length();
		int ans = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a') {
				ans += num;
				if (i < rem)
					ans++;
			}
		}
		
		return ans;
	}

}
