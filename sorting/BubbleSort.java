package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort b = new BubbleSort();
		b.getSortData(new int[] {6,4,2,1},4);

	}

	private void getSortData(int[] a, int n) {
		int swapCount = 0;
		for (int i = 0; i < n; i++) {
		    
		    for (int j = 0; j < n-1 ; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		        	a[j] = a[j]+a[j+1];
		        	a[j+1] = a[j]-a[j+1];
		        	a[j] = a[j] - a[j+1];
		            swapCount++;
		        }
		    }
		    
		}
		
		System.out.println(swapCount);

		System.out.println(a[0]);

		System.out.println(a[n-1]);
	}

}


