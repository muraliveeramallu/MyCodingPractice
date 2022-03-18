package algorithams;

public class ConnectionCellsIncludeCorners {

	public int getMaxConnectedCellArea(int[][] grid) {
       int maxArea = 0;
        for(int row=0; row<grid.length;row++) {
        	for(int column=0; column<grid[row].length;column++) {
        		System.out.println("\n\n====>Started for row = "+row+" column = "+column+" here value is value = "+grid[row][column]);
            	if(grid[row][column] == 1) {
            		System.out.println("Hence value is 1 here go to DFS");
            		int size = getRegionSize(grid,column,row);
            		maxArea = Math.max(maxArea, size);
            	}
            }
        }
       return maxArea;
	}

	private int getRegionSize(int[][] grid, int column, int row) {
		//System.out.println("In DFS for row = "+row+" column = "+column);
		if(column<0 || row<0 || row >= grid.length || column >= grid[row].length) {
			System.out.println("Returning sice pre condition failed");
			return 0;
		}
		
		if(grid[row][column] == 0) {
			return 0;
		}
		grid[row][column] = 0;
		int size = 1;
		for(int r = row-1; r<=row+1; r++) {
			for(int c = column-1; c<=column+1;c++) {
				System.out.println("In DFS for r = "+r+" c = "+c);
				if(r != row || c != column) {//Not considering curremt position
					 System.out.println("Condition success");
				   size  += getRegionSize(grid,c,r);
				   System.out.println("Size here is "+size);
				}
			}
		}
		return size;
		
	}

	public static void main(String a[]) {
		ConnectionCellsIncludeCorners g = new ConnectionCellsIncludeCorners();
		int size = g.getMaxConnectedCellArea(new int[][] {
			{0,0,0,1,1,0,0},
			{0,1,0,0,1,1,0},
			{1,1,0,1,0,0,1},
			{0,0,0,0,0,1,0},
			{1,1,0,0,0,0,0},
			{0,0,0,1,0,0,0}
		});
		
		System.out.println("Size:"+size);

	}
}
