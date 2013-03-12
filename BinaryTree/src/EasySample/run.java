package EasySample;

import java.util.Scanner;

public class run {

	/**
	 * @param args
	 */
	static Scanner console=new Scanner(System.in);

	public static void main(String[] args) {	
		
		
		BinaryTreeExample nt=new BinaryTreeExample();
		
		
		nt.addNode( "dsfa" );
		


		System.out.println("Enter the number of data for processing: ");
		int number=console.nextInt();
		 	
		System.out.println("Enter the data for filling the array: ");
		 
			 
		
		 
		
		System.out.println("Inorder Traversal:");
	 nt.displayTreeInOrder( );
		System.out.println("Preorder Traversal:");	
		 
		System.out.println("Postorder Traversal:");
	 

	}

}
