package algorithams;

import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/shortest-distance-two-cells-matrix-grid/
public class ShortestPath1 {

	static class Point {
		int row;
		int column;
		int distance;

		Point(int row, int column, int distance) {
			this.row = row;
			this.column = column;
			this.distance = distance;

		}
	}

	public static void main(String a[]) {
		char[][] matrix = new char[][] {
			{ '0', '*', '0', 's' }, 
			{ '*', '0', '*', '*' }, 
			{ '0', '*', '*', '*' },
			{ '*', '*', '*', 'd' } 
			};

		System.out.println(shortestDist(matrix));
	}

	private static int shortestDist(char[][] matrix) {
		int sum = 0;
		Point p = new Point(0,0,0);
		Queue<Point> q = new LinkedList<Point>();
		boolean[][] visited = new boolean[matrix.length][matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if (matrix[row][column] == '0') {
					visited[row][column] = true;
				} else {
					visited[row][column] = false;
				}
				if (matrix[row][column] == 's') {
					p.row = row;
					p.column = column;
				}
			}
		}

		q.add(p);
		visited[p.row][p.column] = true;
		while (!q.isEmpty()) {
			Point p1 = q.poll();
			
			if(matrix[p1.row][p1.column] == 'd') {
				return p1.distance;
			}

			if (p1.row-1 >= 0 && visited[p1.row-1][p1.column] != true) {
				//System.out.println("\n\n 1. \n");
				//System.out.println("Before: "+p1.row+" "+p1.column+" "+p1.distance );
                q.add(new Point(p1.row-1,p1.column,p1.distance+1));
               // System.out.println("After: "+p1.row+" "+p1.column+" "+p1.distance );
                visited[p1.row-1][p1.column] = true;
			}
			if (p1.row+1 < matrix.length && visited[p1.row+1][p1.column] != true) {
				//System.out.println("\n\n 2. \n");
				//System.out.println("Before: "+p1.row+" "+p1.column+" "+p1.distance );
				  q.add(new Point(p1.row+1,p1.column,p1.distance+1));
				// System.out.println("After: "+p1.row+" "+p1.column+" "+p1.distance );
	                visited[p1.row+1][p1.column] = true;
			}
			if (p1.column-1 >=0 && visited[p1.row][p1.column - 1] != true) {
				//System.out.println("\n\n 3. \n");
				//System.out.println("Before: "+p1.row+" "+p1.column+" "+p1.distance );
				  q.add(new Point(p1.row,p1.column-1,p1.distance+1));
				 // System.out.println("After: "+p1.row+" "+p1.column+" "+p1.distance );
	                visited[p1.row][p1.column-1] = true;
			}
			if (p1.column+1 < matrix[p1.row].length&& visited[p1.row][p1.column + 1] != true) {
				//System.out.println("\n\n 4. \n");
				//System.out.println("Before: "+p1.row+" "+p1.column+" "+p1.distance );
				  q.add(new Point(p1.row,p1.column+1,p1.distance+1));
				// System.out.println("After: "+p1.row+" "+p1.column+" "+p1.distance );
	                visited[p1.row][p1.column+1] = true;
			}

		}
		
		return -1;

	}

}
