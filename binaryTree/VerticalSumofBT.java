package binaryTree;

import java.util.HashMap;
import java.util.Map;

class BNode{
	int data;
	BNode left;
	BNode right;
    BNode(int data){
		this.data = data;
		left=right=null;
	}
}

public class VerticalSumofBT {
    BNode root;
    Map<Integer,Integer> m = new HashMap<Integer,Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerticalSumofBT v = new VerticalSumofBT();
		v.root = new BNode(1);
		v.root.left = new BNode(2);
		v.root.right = new BNode(3);
		v.root.left.left = new BNode(4);
		v.root.left.right = new BNode(5);
		v.root.right.left = new BNode(7);
		v.root.right.right = new BNode(6);
		v.getVerticalSum(v.root);
	}
	
	public void getVerticalSum(BNode tree) {
		if(tree==null) {
			System.out.println("Tree is empty");
			return;
		}
		m = new HashMap<Integer,Integer>();
		traverseTree(tree,0);
		for(Map.Entry<Integer, Integer> entry : m.entrySet()) {
			 System.out.println("Key = " + entry.getKey() + 
                    ", Value = " + entry.getValue()); 
		}
	}

	private void traverseTree(BNode tree, int rank) {
		if(tree==null)
			return;
		if(m.containsKey(rank)) {
			int i = m.get(rank);
			m.put(rank, tree.data+i);
		}
		else
		m.put(rank, tree.data);
		traverseTree(tree.left,rank-1);
		traverseTree(tree.right,rank+1);
	}

}
