package DataStructureLab7_1c;

public class BinaryTreeNode_Begin {
	int element;
	BinaryTreeNode_Begin left;
	BinaryTreeNode_Begin right;
	
	
	public BinaryTreeNode_Begin(int element) {		
		this(element,null,null);
	}

	public BinaryTreeNode_Begin(int element, BinaryTreeNode_Begin left,
			BinaryTreeNode_Begin right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	
	
	

}
