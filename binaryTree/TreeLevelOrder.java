package binaryTree;

import java.util.Queue;
import java.util.Stack;
class Node2{
	int data;
	Node2 left,right;
	Node2(int data){
		 this.data = data;
		 left=right=null;
	 }
	
}
public class TreeLevelOrder {
   Node2 root;
	public static void main(String[] args) {
		TreeLevelOrder tree = new TreeLevelOrder();
		tree.root = new Node2(3);
		tree.root.left = new Node2(2);
		tree.root.right = new Node2(5);
		tree.root.left.left = new Node2(1);
		//tree.root.left.right = new Node2(3);
		tree.root.right.left = new Node2(4);
		tree.root.right.right = new Node2(6);
		tree.root.right.right.right = new Node2(7);
		tree.LevelOrder(tree.root);

	}
	
	 void LevelOrder(Node2 input)
	    {
	       java.util.LinkedList<Node2> queue = new java.util.LinkedList<Node2>();
	       queue.add(input);
	       while(!queue.isEmpty()){
	           Node2 u = queue.removeFirst();
	           System.out.print(u.data+" ");
	           if(u.left != null)
	               queue.add(u.left);
	           if(u.right!= null)
	               queue.add(u.right);
	       }
	      
	    }
	 public static void inorder_traversal(Node2 root){
			Stack<Node2> s = new Stack<Node2>();
			s.push(root);
			Node2 tempNode = root;
			while(!s.isEmpty()){
				while(tempNode != null && tempNode.left != null){
					s.push(tempNode.left);
					tempNode = tempNode.left;
				}
				tempNode = s.pop();
				System.out.print(tempNode.data+" ");
				tempNode = tempNode.right; 
				if(tempNode != null){
					s.push(tempNode);
				}
			}
			
			
		}


}
