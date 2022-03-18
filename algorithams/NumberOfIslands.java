package algorithams;
//https://leetcode.com/problems/number-of-islands/
public class NumberOfIslands {
	
     public static int getNumberOfIslands(int[][] matrix) {
    	 int count = 0;
    	 for(int row=0; row<matrix.length; row++) {
    		 for(int column=0;column<matrix[row].length;column++) {
    			 if(matrix[row][column] != 0) {
    				 count += dfsRecursive(matrix,row,column);
    			 }
    		 }
    	 }
    	 return count;
     }
	
	private static int dfsRecursive(int[][] matrix, int row, int column) {
		if(row<0 || column<0 || row>=matrix.length || column >= matrix[row].length || matrix[row][column] == 0) {
			return 0;
		}
		matrix[row][column] = 0;
		dfsRecursive(matrix,row,column-1);
		dfsRecursive(matrix,row,column+1);
		dfsRecursive(matrix,row-1,column);
		dfsRecursive(matrix,row+1,column);
		return 1;
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
