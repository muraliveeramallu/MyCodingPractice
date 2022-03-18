package binaryTree;

public class InsertDataToBinaryTree {
    static class Node{
    	int data;
    	Node left;
    	Node right;
    	Node(int data){
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }
    
   static Node root;
    
    static void insert(int data) {
      root = insertData(root, data);
    }
    
    private static Node insertData(Node root, int data) {
    	if(root == null) {
    		root = new Node(data);
    		return root;
    	}
		if(root.data > data) {
			root.left = insertData(root.left,  data);
		}
		if(root.data < data) {
			root.right = insertData(root.right,  data);
		}
		
		return root;
		
	}

	public static void main(String a[]) {
    	/*Node n = new Node(10);
       n.left = new Node(8);
       n.right = new Node(12);
       n.left.left = new Node(7);
       n.left.right = new Node(9);
       n.right.left = new Node(11);
       n.right.right = new Node(13);
       insert(n,3);*/
		
		    insert(50); 
	        insert(30); 
	        insert(20); 
	        insert(40); 
	        insert(70); 
	        insert(60); 
	        insert(80);
    }
}
