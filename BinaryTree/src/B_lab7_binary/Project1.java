package B_lab7_binary;

import java.util.ArrayList;
import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {	
		BinaryTree tree=new BinaryTree();
		
		
		Scanner console=new Scanner(System.in);
		
		
		System.out.println("Enter the number of data for processing: ");
		int number=console.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();	
		System.out.println("Enter the data for filling the array: ");
		for (int i=0;i<number;i++){
			arr.add(console.nextInt());
			//System.out.println(i+"-"+arr.get(i));
			tree.insert(arr.get(i),tree.treeNode);
			
		}
		
		System.out.println("Data in each node of BST");
		for (int i=0;i<number;i++){
			
			System.out.println("The value at Index "+i+" is:"+arr.get(i));
			
		}
		


		System.out.println("Inorder Traversal:");
		tree.inorder(tree.treeNode);
		System.out.println("Preorder Traversal:");
		tree.preorder(tree.treeNode);
		System.out.println("Postorder Traversal:");
		tree.postorder(tree.treeNode);

	}
}
