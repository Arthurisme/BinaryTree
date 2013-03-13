package ataStructureLab8c;

public class BinarySearchTree {
	BinaryTreeNode rootTree;
	
	public BinarySearchTree() {	
		this.rootTree = null;
	}

	public BinaryTreeNode insert(int x, BinaryTreeNode t){		
		if (t==null){			
			return new BinaryTreeNode(x);
		}		
		int compareResult=x-t.element;		
		if (compareResult<0)
			t.left=insert(x,t.left);
		else if (compareResult>0)
			t.right=insert(x,t.right);			
		return t;		
	}
	
	public BinaryTreeNode put(int x){
		rootTree=insert(x,rootTree);
		return rootTree;
	}
	public void InorderTraversal(){
		searchTreeIn(rootTree);		
	}
	public void PreorderTraversal(){
		searchTreePre(rootTree);		
	}
	public void PostorderTraversal(){
		searchTreePost(rootTree);		
	}
	
	public void searchTreePre(BinaryTreeNode t){
		if (t!=null){
			System.out.println(t.element);
			searchTreePre(t.left);
			searchTreePre(t.right);
		}		
	}
	public void searchTreeIn(BinaryTreeNode t){
		if (t!=null){
			searchTreeIn(t.left);			
			System.out.println(t.element);
			searchTreeIn(t.right);
		}		
	}
	public void searchTreePost(BinaryTreeNode t){
		if (t!=null){
			searchTreePost(t.left);			
			searchTreePost(t.right);
			System.out.println(t.element);
		}	
	}
	public void delete(int x) {
		remove(x,rootTree);
	}
	
	public BinaryTreeNode remove(int x,BinaryTreeNode t) {
		if (t==null)
			return t;
		int compare=x-t.element;
		if (compare<0)
			t.left=remove(x,t.left);
		else if(compare>0)
			t.right=remove(x,t.right);
		else if(t.left!=null && t.right!=null){
			t.element=findMax(t.left).element;
			removeMax(t.left);
				
		}
		else
			t=(t.left!=null)?t.left:t.right;			
		return t;		
	}
	
	public void removeMax(BinaryTreeNode t){
		while(t.right.right!=null){
			t=t.right;
		}
		t.right=null;
	}


	public BinaryTreeNode findMax(BinaryTreeNode t){
		if (t!=null)
			while(t.right!=null)
				t=t.right;
		return t;
		
	}
	
	
}
