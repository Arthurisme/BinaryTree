package B_lab7_binary;

public class BinaryTreeNode {
	public int info;
	public BinaryTreeNode leftLink;
	public BinaryTreeNode rightLink;
	
	public BinaryTreeNode(){
		this.info=0;
		this.leftLink=null;
		this.rightLink=null;
	}
	public BinaryTreeNode(int x){
		this.info=x;
		this.leftLink=null;
		this.rightLink=null;
	}
}
