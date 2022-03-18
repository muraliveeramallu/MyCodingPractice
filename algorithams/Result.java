package algorithams;

import java.util.*;

class Result {

    /*
     * Complete the 'findMatrix' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY a as parameter.
     */

    public static List<List<Integer>> findMatrix(List<List<Integer>> a) {
        if(a == null){
            return a;
        }
        int rowSize = a.size();
        int columnSize = a.size()>0?a.get(0).size():0;
        int rowSum = 0;
        if(rowSize == 0 && columnSize == 0) {
            return a;
        }
       List<List<Integer>> b = new  ArrayList<List<Integer>>();
       b.addAll(a);
    
       for (int row = 0; row < rowSize; row++){
           for (int column = 0; column < columnSize; column++){
                b.get(row).set(column, getRowSum(a,row,column));
           }
       }

       return b;

    }

    public static int getRowSum(List<List<Integer>> a,int row,int column) {
        if(row < 0 || column < 0)
         return 0;

         int sum = a.get(row).get(column);
         sum = sum + getRowSum(a,row,column-1) + getRowSum(a, row-1, column);
         return sum;
    }
    
    public static void main(String a[]) {
    	List<List<Integer>> mat = new ArrayList<List<Integer>>();
    	mat.add(new ArrayList());
    	mat.add(new ArrayList());
    	mat.add(new ArrayList());
    	mat.set(0, new ArrayList());
    	mat.set(1, new ArrayList());
    	mat.set(2, new ArrayList());
    	mat.get(0).add(1);
    	mat.get(0).add(2);
    	mat.get(0).add(3);
    	mat.get(1).add( 4);
    	mat.get(1).add(5);
    	mat.get(1).add(6);
    	mat.get(2).add(7);
    	mat.get(2).add(8);
    	mat.get(2).add(9);
    	List<List<Integer>> out = findMatrix(mat);
    	
    	 for (int row = 0; row < out.size(); row++){
             for (int column = 0; column < out.get(row).size(); column++){
                 System.out.print(" "+out.get(row).get(column));
             }
             System.out.println();
         }
    	
    }

}
