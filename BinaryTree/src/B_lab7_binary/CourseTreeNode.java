package B_lab7_binary;

public class CourseTreeNode {
	public Course info;
	public CourseTreeNode leftLink;
	public CourseTreeNode rightLink;
	
	public CourseTreeNode(){
		this.info=null;
		this.leftLink=null;
		this.rightLink=null;
	}
	public CourseTreeNode(Course x){
		this.info=x;
		this.leftLink=null;
		this.rightLink=null;
	}
}
