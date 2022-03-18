package ArraysVol2;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;

/*You have given an integer array which contains numbers from 1 to 100 but one number is missing, 
you need to write a Java program to find that missing number in an array. */
public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(findMissing(new int[]{1,10,4,3,5,6,7,2,9,8,12,13,14}));

	}

	private static int findMissing(int[] a) {
		List<Integer> al = Arrays.stream(a).boxed().collect(Collectors.toList());
		for(int i = 0; i<a.length; i++) {
			if(!al.contains(new Integer(i+1))) {
				return i+1;
			}
		}
		 return 0;
	}
	
	private static int getMissingNumber(int[] numbers, int totalCount) { 
		int expectedSum = totalCount * ((totalCount + 1) / 2); 
		int actualSum = 0; 
		for (int i : numbers) { 
			actualSum += i; 
			} 
		return expectedSum - actualSum; 
		}


}
