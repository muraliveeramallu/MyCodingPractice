package MapHashTable;

import java.util.Stack;

public class FrequencyQueries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrequencyQueries f = new FrequencyQueries();
		f.getFrequenceQueries(new int[][] { {1,5},
				                        {1,6},
				                        {3,2},
				                        {1,10},
				                        {1,10},
				                        {1,6},
				                        {2,5},
				                        {3,2}});

	}

	private void getFrequenceQueries(int[][] array) {
		Stack<Integer> temp = new Stack<Integer>();
       for(int i=0;i<array.length;i++) {
    	   int j = 0;
    	   if (array[i][0] == 1) {
    		   temp.push(array[i][1]);
    	   } else if (array[i][0] == 2) {
    		   temp.push(array[i][1]);
    		   
    	   } else if (array[i][0] == 3) {
    		   
    	   }
       }		
	}

}
