package hrArray;

import java.io.*;
import java.math.*;
import java.util.*;

public class MinimumSwapsOFArray {
	static int minimumSwaps(int[] arr) {
		int[] sorted = new int[arr.length];
		  for (int i = 0; i < arr.length; i++) {
		   sorted[i] = arr[i];
		  }
		  Arrays.sort(sorted);
		  int j = 0;
		  for (int i = 0; i < arr.length; i++) {
		   if (arr[i] == sorted[i])
		    j++;
		  }
		  return arr.length - j;
	}

	public static void main(String[] args) {
		
		/*Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}*/
		
		 //minimumSwaps(new int[] {1, 2, 4, 3});
		System.out.println(minimumSwaps(new int[] {1, 2, 4, 3}));
		System.out.println(minimumSwaps(new int[] {1,1,1,2,2}));
		System.out.println(minimumSwaps(new int[] {2, 1, 3, 1, 2}));
		//scanner.close();
	}
}
