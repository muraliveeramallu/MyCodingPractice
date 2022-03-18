package ArraysVol2;

public class SubArrayWithLargestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLargestProductSubArray(new int[] {-2,2,3,-2,4});
		getLargestProductSubArray(new int[] {-2,-2,-2,3,4});

	}

	private static void getLargestProductSubArray(int[] a) {
		int max = 0, product = 1;
		int start = 0, end = 0, s= 0;
		for(int i = 0;i<a.length;i++) {
			product = product*a[i];
			if(max<product) {
				max = product;
				start = 0;
				end = i;
			}
			
			if(product < 0) {
				product = 1;
				s = i+1;
			}
		}
		System.out.println("Max Sum "+max);
		for(int i = start; i<=end;i++) {
			System.out.print(a[i]+" ");
			
		}
	}

}
