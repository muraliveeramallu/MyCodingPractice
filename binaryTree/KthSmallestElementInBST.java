package binaryTree;

import java.util.Stack;

public class KthSmallestElementInBST {
	private static final BTreeNode BTreeNode = null;
	public static BTreeNode root;
	public  int counter1;
	public  int counter2;

	public static void main(String a[]) {
		KthSmallestElementInBST k = new KthSmallestElementInBST();
		k.addNode(root, 40);
		k.addNode(root, 30);
		k.addNode(root, 50);
		k.addNode(root, 60);
		k.addNode(root, 20);
		k.addNode(root, 10);
		k.addNode(root, 70);
		
		k.inOrderTraverse(root);
		
		BTreeNode bTreSmalleNode = k.findKthSmallestElement(root, 6);
		
		System.out.println("Element:"+bTreSmalleNode.getData());
		
         BTreeNode bTreeHighNode = k.findKthHighestElement(root, 2);
		
		System.out.println("Element:"+bTreeHighNode.getData());

	}

	private BTreeNode findKthHighestElement(BTreeNode root2, int position) {
		if(root2 == null)
			return null;
		
		BTreeNode bTreeHighNode  = findKthHighestElement(root2.getRight(), position);
		
		if(counter2 != position) {
			counter2++;
			bTreeHighNode = root2;
		}
		
		if(counter2 == position) {
			return bTreeHighNode;
		} else {
			return findKthHighestElement(root2.getLeft(), position);
		}
	   				
	}

	private BTreeNode findKthSmallestElement(BTreeNode root2, int position) {
		if(root2 == null)
			return null;
		
		BTreeNode bTreeNode = findKthSmallestElement(root2.getLeft(), position);
		
		if(counter1 != position) {
			counter1 ++;
			bTreeNode = root2;	
		}
		
		if(counter1 == position) {
			return bTreeNode;
		} else {
			return findKthSmallestElement(root2.getRight(), position);
		}
	}
	
	

	private void inOrderTraverse(BTreeNode root2) {
		if(root2 == null)
			return;
		inOrderTraverse(root2.getLeft());
		System.out.println(root2.getData());
		inOrderTraverse(root2.getRight());		
	}

	private void addNode(BTreeNode root2, int data) {
		if (root2 == null) {
			BTreeNode temp = new BTreeNode(data);
			root = temp;
		} else {
			addNodesInOrder(root2, data);
		}

	}

	private void addNodesInOrder(BTreeNode root2, int data) {
		if (root2.getData() > data) {
          if(root2.getLeft() != null) {
        	  addNode(root2.getLeft(),data);
        	 
          } else {
        	  BTreeNode temp = new BTreeNode(data);
  			  root2.setLeft(temp);  
          }
		}

		if (root2.getData() < data) {
          if(root2.getRight() != null) {
        	  addNode(root2.getRight(), data);
        	 
          } else {
        	  BTreeNode temp = new BTreeNode(data);
  			  root2.setRight(temp); 
          }
		}

	}
	
	public int kthSmallest(TreeNode root, int k) {
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	 
	    TreeNode p = root;
	    int result = 0;
	 
	    while(!stack.isEmpty() || p!=null){
	        if(p!=null){
	            stack.push(p);
	            p = p.left;
	        }else{
	            TreeNode t = stack.pop();
	            k--;
	            if(k==0)
	                result = t.data;
	            p = t.right;
	        }
	    }
	 
	    return result;
	}

}

class BTreeNode {

	private BTreeNode left;
	private BTreeNode right;
	private int data;

	public BTreeNode(int data) {
		this.data = data;
	}

	public BTreeNode getLeft() {
		return left;
	}

	public void setLeft(BTreeNode left) {
		this.left = left;
	}

	public BTreeNode getRight() {
		return right;
	}

	public void setRight(BTreeNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}