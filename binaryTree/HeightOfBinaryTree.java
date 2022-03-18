package binaryTree;

 class Node1{
	int data;
	Node1 left,right;
	 Node1(int data){
		 this.data = data;
		 left=right=null;
	 }
	
}

public class HeightOfBinaryTree {
	Node1 root;
	public static void main(String a[]) {
		HeightOfBinaryTree tree = new HeightOfBinaryTree();
		tree.root = new Node1(3);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(5);
		tree.root.left.left = new Node1(1);
		//tree.root.left.right = new Node1(3);
		tree.root.right.left = new Node1(4);
		tree.root.right.right = new Node1(6);
		tree.root.right.right.right = new Node1(7);
		System.out.println(tree.getHeight(tree.root));
	}
	
	private int getHeight(Node1 binaryTree) {
		if(binaryTree == null) {
			return 0;
		}
		int leftHeight = 0;
	    int rightHeight = 0;

	    if (binaryTree.left != null) {
	        leftHeight = 1 + getHeight(binaryTree.left);
	    }

	    if (binaryTree.right != null) {
	        rightHeight = 1 + getHeight(binaryTree.right);
	    }

	    return leftHeight > rightHeight ? leftHeight : rightHeight;

	}

}
