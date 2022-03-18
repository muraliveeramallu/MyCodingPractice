package binaryTree;

/*
https://leetcode.com/problems/merge-two-binary-trees/
  Tree - 1
     
              10
             /  \
            9    11
           /       \ 
          8         12
                    
  Tree - 2
    
    
              9
             /  \
            7    10
           / \     
          6   8      
               \
                10
        
            
   Tree - Output        
   
              19
             /  \
            16   21
           / \     \  
         14   8     12 
               \
                10
                

 */

public class SumOfTwoBinaryTrees {
    static Node output;
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data= data;
			this.left = null;
			this.right = null;
		}
	}
	public static void main(String[] args) {
        Node n1 = new Node(9);
        n1.left = new Node(7);
        n1.right = new Node(10);
        n1.left.left = new Node(6);
        n1.left.right = new Node(8);
        n1.left.right.right = new Node(10);
        
        Node n2 = new Node(10);
        n2.left = new Node(9);
        n2.right = new Node(11);
        n2.left.left = new Node(8);
        n2.right.right = new Node(12);
        
        getSumOfTrees(n1,n2);
	}
	private static Node getSumOfTrees(Node n1, Node n2) {
	Node output = getOutPutTree(n1,n2);
	return output;
		
	}
	private static Node getOutPutTree(Node n1, Node n2) {
		if(n1 == null)
			return n2;
		if(n2==null)
		    return n1;
		 n1.data += n2.data;		 
		 n1.left = getOutPutTree(n1.left, n2.left); 
         n2.right = getOutPutTree(n1.right, n2.right); 
         return n1; 
		
	}

}
