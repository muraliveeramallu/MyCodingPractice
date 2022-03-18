package algorithams;

public class StairCaseProblem {
	static int[] k = new int[] {1,2,3};
	public static int findStep(int n) {
		if (n == 0)
			return 1;

		int sum = 0;
		for (int i = 0; i < k.length; i++) {
			if(n-i >=0)
			 sum = sum + findStep(n - k[i]);
		}

		return sum;
	}
	public static int findStep2(int n) 
    { 
        int[] res = new int[n + 1]; 
        res[0] = 1; 
        res[1] = 1; 
        res[2] = 2; 
  
        for (int i = 3; i <= n; i++) 
            res[i] = res[i - 1] + res[i - 2] 
                                + res[i - 3]; 
  
        return res[n]; 
    } 

	// Driver function
	public static void main(String argc[]) {
		int n = 4;
		System.out.println(findStep(n));
	}
}
