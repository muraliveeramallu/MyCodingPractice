package binaryTree;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterElement n  = new NextGreaterElement();
		n.findNextGreaterElement(new int[] {11,8, 13, 25, 21,3});
	}
	
	private void findNextGreaterElement(int[] inputArray) { 

		        Stack<Integer> s = new Stack<Integer>(); 
		        int nge[] = new int[inputArray.length]; 
		  
		        // iterate for rest of the elements  
		        for (int i = inputArray.length - 1; i >= 0; i--) { 
		              
		               /* if stack is not empty, then  
		            pop an element from stack.  
		            If the popped element is smaller  
		            than next, then  
		            a) print the pair  
		            b) keep popping while elements are  
		            smaller and stack is not empty */
		            if (!s.empty()) { 
		                while (!s.empty() && s.peek() <= inputArray[i]) { 
		                    s.pop(); 
		                } 
		            } 
		            nge[i] = s.empty() ? -1 : s.peek(); 
		            s.push(inputArray[i]); 
		  
		        } 
		        for(int i = 0; i < inputArray.length; i++)  
		        System.out.print(nge[i] + " "); 
		    } 
	
	private void findNextGreaterElement1(int[] inputArray) { 
		Stack<Integer> s = new Stack<Integer>();
		int[] temp = new int[inputArray.length];
		
		for(int i=inputArray.length-1;i>=0;i--) {
			if(!s.empty()) {
				while(!s.empty() && s.peek() <= inputArray[i] ) {
					s.pop();
				}
			}
			
			temp[i] = s.empty() ? -1 : s.peek();
			s.push(inputArray[i]);
		}
		
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i] + " ");
		}
	}

}
