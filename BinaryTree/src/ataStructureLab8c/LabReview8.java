package ataStructureLab8c;


public class LabReview8 {

	public static void main(String[] args) {	
		BinarySearchTree tree=new BinarySearchTree();	
		tree.put(7);
		tree.put(5);
		tree.put(15);
		tree.put(6);
		tree.put(2);
		tree.put(8);	
		
		
		System.out.println("Showing the tree by Inorder Traversal  :");

		 
		 tree.InorderTraversal();
		
		System.out.println("Inorder Traversal after deleting number of 7:");

		 tree.delete(7);
		 tree.InorderTraversal();
		

		
	

}
	
	
	
}
