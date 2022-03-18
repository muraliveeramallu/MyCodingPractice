package algorithams;

public class MaxConnectedColors {
	 public static int getNumberOfIslands(String[][] matrix) {
    	 int maxArea = 0;
    	 for(int row=0; row<matrix.length; row++) {
    		 for(int column=0;column<matrix[row].length;column++) {
    			 if("G".equals(matrix[row][column])) {
    				 maxArea = Math.max(maxArea, dfsRecursive(matrix,row,column,"G"));
    			 }
    			 if("R".equals(matrix[row][column])) {
    				 maxArea = Math.max(maxArea, dfsRecursive(matrix,row,column,"R"));
    			 }
    			 if("B".equals(matrix[row][column])) {
    				 maxArea = Math.max(maxArea, dfsRecursive(matrix,row,column,"B"));
    			 }
    		 }
    	 }
    	 return maxArea;
     }
	
	private static int dfsRecursive(String[][] matrix, int row, int column, String color) {
		if(row<0 || column<0 || row>=matrix.length || column >= matrix[row].length || !color.equals(matrix[row][column])) {
			return 0;
		}
		matrix[row][column] = "0";
		int area = 1;
		area += dfsRecursive(matrix,row,column-1,color);
		area += dfsRecursive(matrix,row,column+1,color);
		area += dfsRecursive(matrix,row-1,column,color);
		area += dfsRecursive(matrix,row+1,column,color);
		return area;
	}

	public static void main(String a[]) {	
		int count = getNumberOfIslands(new String[][] {
		{"G","G","B","R"},
		{"G","B","R","B"},
		{"R","B","B","B"}
	});
		
		System.out.println(count);
	}
}
