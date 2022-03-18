package binaryTree;

import java.util.LinkedList;

class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(int data){
		 this.data = data;
		 left=right=null;
	 }
}

public class InvertBinaryTree {
	public TreeNode invertTree1(TreeNode root) {
	    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	 
	    if(root!=null){
	        queue.add(root);
	    }
	 
	    while(!queue.isEmpty()){
	        TreeNode p = queue.poll();
	        if(p.left!=null)
	            queue.add(p.left);
	        if(p.right!=null)
	            queue.add(p.right);
	 
	        TreeNode temp = p.left;
	        p.left = p.right;
	        p.right = temp;
	    }
	 
	    return root;    
	}
	
	public TreeNode invertTree(TreeNode root) {
	    if(root!=null){
	        helper(root);
	    }
	 
	    return root;    
	}
	 
	public void helper(TreeNode p){
		if(p==null)
			return;
	 
	    TreeNode temp = p.left;
	    p.left = p.right;
	    p.right = temp;
	 
	    if(p.left!=null)
	        helper(p.left);
	 
	    if(p.right!=null)
	        helper(p.right);
	}
}
