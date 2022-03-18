package hrArray;

import java.util.LinkedList;

/*
Given 1 2 3 4 5   r = 4
r1 -> 2 3 4 5 1
r2 -> 3 4 5 1 2
r3 -> 4 5 1 2 3
r4 -> 5 1 2 3 4
*/
import java.util.Queue;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayLeftRotation a = new ArrayLeftRotation();
		a.leftRotation(new int[] {1,2,3,4,5},11);

	}

	
	private void leftRotation(int[] list, int r) {
		int b[] = new int[list.length];
		int n = list.length;
		if(r>list.length)
			r = r%list.length;
		if(list.length == r) {
			b = list;
		} else {
		for(int i=0;i<list.length;i++) {
			/*if((r-i)<0)
				b[n+i-r] = list[i];
			else
				b[r-i] = list[i];*/
			  int newLocation = (i + (n - r)) % n;
			  b[newLocation] = list[i];
		}
		}
		for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
	}

}


