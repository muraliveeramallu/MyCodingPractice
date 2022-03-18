package algorithams;

public class MaxAreaOfIsland {
	 public static int getNumberOfIslands(int[][] matrix) {
    	 int maxArea = 0;
    	 for(int row=0; row<matrix.length; row++) {
    		 for(int column=0;column<matrix[row].length;column++) {
    			 if(matrix[row][column] != 0) {
    				 maxArea = Math.max(maxArea, dfsRecursive(matrix,row,column));
    			 }
    		 }
    	 }
    	 return maxArea;
     }
	
	private static int dfsRecursive(int[][] matrix, int row, int column) {
		if(row<0 || column<0 || row>=matrix.length || column >= matrix[row].length || matrix[row][column] == 0) {
			return 0;
		}
		matrix[row][column] = 0;
		int area = 1;
		area += dfsRecursive(matrix,row,column-1);
		area += dfsRecursive(matrix,row,column+1);
		area += dfsRecursive(matrix,row-1,column);
		area += dfsRecursive(matrix,row+1,column);
		return area;
	}

	public static void main(String a[]) {
		/*int count = getNumberOfIslands(new int[][] {
			{0,0,0,1,1},
			{0,0,0,1,1},
			{0,0,1,0,0},
			{1,0,0,1,1}
		});*/
		
		
		int count = getNumberOfIslands(new int[][] {
		{0,0,1,1},
		{0,0,0,1},
		{0,0,1,0},
		{1,0,0,1}
	});
		
		System.out.println(count);
	}
}
