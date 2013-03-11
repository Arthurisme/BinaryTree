package DataStructureLab7_1c;
import java.util.ArrayList;
import java.util.Scanner;

import EasySample.Node;


public class LabReview7_BinaryTree {

static Scanner console=new Scanner(System.in);

	public static void main(String[] args) {	
		BinaryTreeNode tree=null;
		System.out.println("Enter the number of data for processing: ");
		int number=console.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();	
		System.out.println("Enter the data for filling the array: ");
		for (int i=0;i<number;i++){
			arr.add(console.nextInt());
			tree=insert(arr.get(i),tree);
		}
		
		System.out.println("Inorder Traversal:");
		searchTreeIn(tree);
		System.out.println("Preorder Traversal:");	
		searchTreePre(tree);
		System.out.println("Postorder Traversal:");
		searchTreePost(tree);

}

	public static BinaryTreeNode insert(int x, BinaryTreeNode t){
	
		if (t==null)
			return new  BinaryTreeNode(x);	
		int compareResult=x-t.element;
		
		if (compareResult<0)
			t.left=insert(x,t.left);
		else if (compareResult>0)
			t.right=insert(x,t.right);
		
		return t;		
		
	}
	
	   /**
	   * insert a node into the tree at the correct position
	   *
	   * @param n - the current point of the tree being examined
	   * @param temp - the Node to be added
	   */
	   public void insertNode(Node n, Node temp)
	   {
	     // get the data entries of the nodes,
	     // the (String) is a cast - it converts type Object to type String
	     String ns = (String) n.getData();
	     String ts = (String) temp.getData();

	    // compare the data elements
	     if (ts.compareTo(ns) > 0)
	     {
	       // test add at right
	    	 System.out.append("Testing right of " + ns + "\n");
	       if (n.getRight() == null)
	       {
	         // found a space to put this node
	         n.setRight(temp);
	       }
	       else
	       {
	         // try again at the next one down
	         insertNode( n.getRight(), temp);
	       }
	     }
	     else
	     {
	       // test add at left
	       System.out.append("Testing left of " + ns + "\n");
	       if (n.getLeft() == null)
	       {
	         n.setLeft(temp);
	       }
	       else
	       {
	         insertNode( n.getLeft(), temp);
	       }
	     }
	   }
	
	public static void searchTreePre(BinaryTreeNode t){
		if (t!=null){
			System.out.println(t.element);
			searchTreePre(t.left);
			searchTreePre(t.right);
		}		
	}
	public static void searchTreeIn(BinaryTreeNode t){
		if (t!=null){
			searchTreeIn(t.left);			
			System.out.println(t.element);
			searchTreeIn(t.right);
		}		
	}
	public static void searchTreePost(BinaryTreeNode t){
		if (t!=null){
			searchTreePost(t.left);			
			searchTreePost(t.right);
			System.out.println(t.element);
		}		
	}


	
	
	
}
