package binaryTree;

public class BinarySearchTreeOrnot {
	
	static class Node {
		int val;
		Node left;
		Node right;
		Node(int val) {
			this.val=val;
			this.left=null;
			this.right = null;
		}
	}
	
	static boolean isBinarySearchTree(Node root) {
		boolean isBinaryTree = orderTraverse(root);
		return isBinaryTree;
	}
	
	 private static boolean orderTraverse(Node root) {
		 //Its not working refer commented code
		 if(root == null)
			 return true;
		 if(root.left != null) {
		 orderTraverse(root.left);
		 if(root.val < root.left.val) {
				return false;
		}
		 }
		 if(root.right != null) {
		 orderTraverse(root.right);
			
			if(root.val > root.right.val) {
				return false;
			}
		 }

		
		return true;
	}

	Node root;
	
	public static void main(String a[]) {
		BinarySearchTreeOrnot b = new BinarySearchTreeOrnot();
		b.root = new Node(100);
		b.root.left = new Node(70);
		b.root.right = new Node(120);
		b.root.left.left = new Node(60);
		b.root.left.right = new Node(80);
		b.root.right.left = new Node(110);
		b.root.right.right = new Node(100);
		b.root.left.left = new Node(50);
		
		System.out.println(b.isBinarySearchTree(b.root));
	}

}


 class Solution {
		static class Node {
			int val;
			Node left;
			Node right;
			Node(int val) {
				this.val=val;
				this.left=null;
				this.right = null;
			}
		}
  public boolean isBSTHelper(Node node, Integer minVal, Integer maxVal) {
    if ((minVal != null) && (node.val <= minVal))
      return false;
    if ((maxVal != null) && ( node.val > maxVal))
      return false;

    boolean left = node.left != null ? isBSTHelper(node.left, minVal, node.val) : true;
    if (left) {
      boolean right = node.right != null ? isBSTHelper(node.right, node.val, maxVal) : true;
      return right;
    } else
      return false;
  }

  public boolean isValidBST(Node root) {
    if (root == null)
      return true;

    return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
}
 

//https://leetcode.com/problems/validate-binary-search-tree/solution/
