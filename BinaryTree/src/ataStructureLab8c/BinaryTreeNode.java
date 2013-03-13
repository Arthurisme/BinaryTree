package ataStructureLab8c;

public class BinaryTreeNode {
	int element;
	BinaryTreeNode left;
	BinaryTreeNode right;
	
	
	public BinaryTreeNode(int element) {		
		this(element,null,null);
	}

	public BinaryTreeNode(int element, BinaryTreeNode left,
			BinaryTreeNode right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	
	
	

}
