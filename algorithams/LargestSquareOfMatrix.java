package algorithams;

public class LargestSquareOfMatrix {
	
	private static int getLargestSquareOfMatrix(int[][] matrix){
		int maxResult = 0;
		int[][] cacheMatrix = new int[matrix.length][matrix[0].length];
		
		for(int row = 0; row< matrix.length; row++) {
			for(int column=0; column<matrix[row].length; column++) {
				if(row == 0 || column == 0) {
					cacheMatrix[row][column] = matrix[row][column];
				} else {
					if(matrix[row][column] > 0) {
					   cacheMatrix[row][column] = 1+Math.min(cacheMatrix[row-1][column],Math.min(cacheMatrix[row][column-1],cacheMatrix[row-1][column-1]));
					}
				}
				
				if(cacheMatrix[row][column] > maxResult) {
					maxResult = cacheMatrix[row][column];
				}
			}
		}
				
		return maxResult;		
	}


	public static void main(String[] args) {
		int max = getLargestSquareOfMatrix(new int[][] {
		{0,0,0,1,1,1},
		{0,0,0,1,1,1},
		{0,0,1,1,1,1},
		{1,0,0,1,1,0}
	});
		
		System.out.println(max);

	}

}
