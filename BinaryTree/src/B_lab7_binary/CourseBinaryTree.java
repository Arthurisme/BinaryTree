package B_lab7_binary;

public class CourseBinaryTree {
	int compareResult;
	CourseTreeNode treeNode=null;
	int size=0;
	
	
	public CourseTreeNode insert(Course x,CourseTreeNode t){
		if(this.treeNode==null){
			this.treeNode=new CourseTreeNode(x);
			size++;
			
			return treeNode;
			
		}
		if(t==null){
			size++;
			//System.out.println("+"+x);
			return new CourseTreeNode(x);
			
		}else{
			
			compareResult=x.getMax_enrl()-t.info.getMax_enrl();
			//System.out.println("x="+x+" info="+t.info);
			if(compareResult<0){
				t.leftLink=insert(x,t.leftLink);
			}else if(compareResult>0){
				t.rightLink=insert(x,t.rightLink);
			}
		}
		
		return t;
		
	}


	
	public void preorder(BinaryTreeNode p){
		
		if(p!=null){
			System.out.println("---"+p.info+"---");
			preorder(p.leftLink);
			preorder(p.rightLink);
			
		}
		
	}
	
	public void postorder(BinaryTreeNode p){
		
		if (p != null)
		{
			postorder(p.leftLink);
			postorder(p.rightLink);
			System.out.println("---"+p.info+"---");
		}
	}
		
	public void inorder(BinaryTreeNode p){
		
		if (p != null)
		{
			inorder(p.leftLink);
			System.out.println("---"+p.info+"---");
			inorder(p.rightLink);
		}
	}
}
