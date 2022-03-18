package ArraysVol2;
//https://practice.geeksforgeeks.org/problems/stickler-theif/0
public class SticklerThief {

	public static void main(String[] args) {
    // System.out.println(maxSum(6, new int[] {10,30,100,30,10,5}));
     System.out.println(maxSum(7, new int[] {200,30,100,30,10,5,300}));
	}

	private static int maxSum(int n, int[] hs) {
		// TODO Auto-generated method stub
		int maxSum = 0;
		int sum = 0;

		int  i = 0;
		int j = i+2;
		
		while(i<n) {
			if(hs[i]+hs[j]>maxSum && i > 0 && j<n) {
				maxSum = hs[i]+hs[j];
			}
			if(j<n-1)
		 	 j++;
			if(j==n-1)
			{
				if(hs[i]+hs[j]>maxSum  && i > 0 && j<n) {
					maxSum = hs[i]+hs[j];
				}
				i++;
				if(i<n-2)
				    j = i+2;
				else
					return maxSum;
			}
		}
		
		return maxSum;
		
	}

}
