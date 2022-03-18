package ArraysVol2;

import java.util.Arrays;

public class SumofThreeNumbersZeroInArray {

	public static void main(String[] args) {
		System.out.println(sumofThreeNumbersZeroInArrayBool(new int[] {-1,-2,1,5,2,6,7,1},3));
	}
//	-1,-2,1,2 5 6 7
	public static boolean sumofThreeNumbersZeroInArrayBool(int[] a, int num){
		boolean found = false;
		Arrays.sort(a);
		
		for(int i = 0; i<a.length; i++) {
			int left = i+1;
			int right = a.length-1;
			int current = a[i];
			
			while(left<right) {
				if(a[left]+a[right]+current == num)
				{
					    System.out.print(current + " "); 
	                    System.out.print(a[left]+ " "); 
	                    System.out.println(a[right]+ " "); 
	                    
					left++;
					right--;
					found = true;
				} else if(a[left]+a[right]+current > num)
					right--;
				else
					left++;
			}
		}
		
		return found;
	}

	
}
