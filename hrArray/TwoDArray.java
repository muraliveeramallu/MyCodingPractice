package hrArray;
//https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class TwoDArray {
  public static void main(String a[]) {
	  TwoDArray t = new TwoDArray();
	  int[][] array = new int[][] {  {1, 1, 1, 0, 0, 0},
		  							 {0, 1, 0, 0, 0, 0},
		  							 {1, 1, 1, 0, 0, 0},
		  							 {0, 0, 2, 4, 4, 0},
		  							 {0, 0, 0, 2, 0, 0},
		  							 {0, 0, 1, 2, 4, 0}};
	  System.out.println(t.getHighestGlassDoorSum(array));
  }

	private int getHighestGlassDoorSum(int[][] a) {

		int temp = 0;
		int sum = 0;
		for (int i = 0; i < (a.length/2)+1; i++) {
			for (int j = 0; j < (a.length/2)+1; j++) {
					temp = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
							+ a[i + 2][j + 2];
					System.out.println(a[i][j]+"\t"+a[i][j + 1]+"\t"+a[i][j + 2]);
					System.out.println("\t"+a[i + 1][j + 1]+"\t");
					System.out.println(a[i + 2][j]+"\t"+a[i + 2][j + 1]+"\t"+a[i + 2][j + 2]);
					System.out.println("Sum = "+sum);
					System.out.println("------------------------------");
				if (temp > sum)
					sum = temp;
			}

		}
		return sum;
	}
}
