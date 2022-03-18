package ArraysVol2;

//For example, if given integer array is [20, 34, 21, 87, 92, 2147483647] then first maximum is 2147483647 and second maximum is 92


public class ToptwoMaxNumbersOfAnArrayWithOutSorting {

	public static void main(String[] args) {
		getTopMaxNumbersOfAnArray(new int[] {92, 34, 21, 87, 8, 2147483647});
	}

	private static void getTopMaxNumbersOfAnArray(int[] a) {
		int max1 = Integer.MIN_VALUE;
		int max2 = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				max2 = max1;
				max1 = a[i];
			}else if (a[i] > max2) { max2 = a[i]; }

		}
		
		System.out.println(max1);
		System.out.println(max2);
		
	}

}
