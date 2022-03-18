package algorithams;

import java.util.Stack;

public class LargestRectangleOfMatrix {
	private static int getLargestRecOfMatrix(int[][] matrix){
		int[] plane = matrix[0];
		int max = 0;
		
		for(int row=0; row<matrix.length;row++) {
			if(row==0) {
				max = Math.max(max,findMax(plane));
			} else {
				for(int column=0; column<matrix[row].length;column++) {
					if(matrix[row][column] == 0) {
						plane[column] = 0;
					} else {
						plane[column] += 1;
					}
				}
				max = Math.max(max,findMax(plane));
			}
			
			
		}
		
		return max;
	}
	private static int findMax(int[] plane) {
		
        int m = 0;
        int i= 0;
        Stack<Integer> s = new Stack<Integer>();
        
        while(i<plane.length) {
        	if(s.isEmpty() || plane[i] >= plane[s.peek()]) {
        		s.push(i);
        		i++;
        	} else {
        		int p = s.pop();
        		int h = plane[p];
        		int w = s.isEmpty()?i:i-s.peek()-1;
        		m = Math.max(m, h*w);
        	}
        	
        }
        
        while(!s.isEmpty()) {
        	int p = s.pop();
    		int h = plane[p];
    		int w = s.isEmpty()?i:i-s.peek()-1;
    		m = Math.max(m, h*w);
        }
        		
		return m;
	}
	
	public static void main(String[] args) {
		int max = getLargestRecOfMatrix(new int[][] {
		{0,0,0,1,1,1},
		{0,0,0,1,1,1},
		{0,0,1,1,1,1},
		{1,0,0,1,1,0}
	});
		
		/*int max = getLargestRecOfMatrix(new int[][] {
			{1,0,0,1,1,1},
			{1,0,1,1,0,1},
			{0,1,1,1,1,1},
			{0,0,1,1,1,1}
		});*/
		
		System.out.println(max);

	}
}
