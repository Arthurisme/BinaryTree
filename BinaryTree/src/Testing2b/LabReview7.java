package Testing2b;
import java.util.ArrayList;
import java.util.Scanner;


public class LabReview7 {

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
			return new BinaryTreeNode(x);	
		int compareResult=x-t.element;
		
		if (compareResult<0)
			t.left=insert(x,t.left);
		else if (compareResult>0)
			t.right=insert(x,t.right);
		
		return t;		
		
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
