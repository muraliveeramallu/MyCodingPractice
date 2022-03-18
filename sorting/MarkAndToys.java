package sorting;

import java.util.Arrays;

public class MarkAndToys {

	public static void main(String[] args) {
		MarkAndToys m = new MarkAndToys();
		m.getMaxNumberOfToys(new int[] {80,50,1,6,5,111,124,123,5,4,23},50);
	}

	private void getMaxNumberOfToys(int[] a, int canSpend) {
         int toysCount = 0;
         int amountSpent = 0;
         Arrays.sort(a);
		 for(int i=0; i<a.length; i++) {
			 if(a[i]>canSpend)
				 continue;
			 if(amountSpent<canSpend && (canSpend-amountSpent)>a[i]) {
				 toysCount++;
			    amountSpent = amountSpent+a[i];
			 }
			 
		 }
		 
		 System.out.println(toysCount);;
	}

}

//1,5.5.12,111,124,123
