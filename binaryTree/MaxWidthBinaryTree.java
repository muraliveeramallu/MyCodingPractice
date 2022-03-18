package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

class BNode2{
	int data;
	BNode2 left,right;
	BNode2(int data){
		 this.data = data;
		 left=right=null;
	 }
}
public class MaxWidthBinaryTree {
	BNode2 root;
	 public static void main(String a[]) {
		 MaxWidthBinaryTree v = new MaxWidthBinaryTree();
			v.root = new BNode2(1);
			v.root.left = new BNode2(2);
			v.root.right = new BNode2(3);
			v.root.left.left = new BNode2(4);
			v.root.left.right = new BNode2(5);
			v.root.right.left = new BNode2(7);
			v.root.right.right = new BNode2(6);
			System.out.println(v.getMaxWidthBinaryTree(v.root));
		 
	 }
	private int getMaxWidthBinaryTree(BNode2 tree) {
         if(tree==null)
        	 return 0;
         int maxWidth = 0;
         Queue<BNode2> queue= new java.util.LinkedList<BNode2>();
         
         queue.add(tree);
         maxWidth = queue.size()>maxWidth?queue.size():maxWidth;
         while(!queue.isEmpty()) {
        	 maxWidth = queue.size()>maxWidth?queue.size():maxWidth;
        	 BNode2 temp = queue.poll();
        	 if(temp.left !=null)
        		 queue.add(temp.left);
        	 if(temp.right != null)
        		 queue.add(temp.right);
         }
         
         
         
         return maxWidth;
	}
}
