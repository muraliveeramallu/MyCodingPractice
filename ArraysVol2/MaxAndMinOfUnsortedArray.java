package ArraysVol2;

public class MaxAndMinOfUnsortedArray {
	public static void main(String a[]) {
		minAndMAx(new int[] {10,20,5,6,7,5,4,3});
		
	}

	private static void minAndMAx(int[] a) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i< a.length; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}
		
		System.out.println("Min="+min+" Max="+max);
		
	}

}
