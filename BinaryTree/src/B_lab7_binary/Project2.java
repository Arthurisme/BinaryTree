package B_lab7_binary;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Project2 {
	
	 static String[] course_info=new String[4];
	
	 public static void main(String[] args) throws FileNotFoundException {
	        // TODO code application logic here
		 
	        
	        Course currentCourse;
	        CourseBinaryTree tree=new CourseBinaryTree();
	        Course.credits=3;

	        Scanner inFile = new Scanner(new FileReader("Course.in"));

	        while(inFile.hasNext()){
	        	currentCourse=new Course();
	        	DealData(inFile.nextLine());
	        	currentCourse.setValue(course_info[0],course_info[1] , course_info[3]);
		        
	        	tree.insert(currentCourse,tree.treeNode);
	        	
	        }
	        System.out.println("size:"+tree.size);

	        

	       

	        inFile.close();
	    }

	    public static void DealData(String dataContent){
	        course_info=dataContent.split("	");
	    }

}
