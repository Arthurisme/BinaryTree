package B_Lab9_c;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class P4 {
	static String[] course_info=new String[4];
	
	
	 public static void main(String[] args) throws FileNotFoundException {
	        // TODO code application logic here
		 
	        
	        Course currentCourse;
	        
	        HashSet<Course> courseList = new HashSet<Course>();

	        Scanner inFile = new Scanner(new FileReader("Course.in"));

	        while(inFile.hasNext()){
	        	currentCourse=new Course();
	        	DealData(inFile.nextLine());
	        	currentCourse.setValue(course_info[0],course_info[1] , course_info[3],course_info[2]);
		        
	        	courseList.add(currentCourse);
	        	
	        }
	        
	        
	        System.out.println();
	        System.out.println("CourseList size="+courseList.size());
	        
	        
	        System.out.println("Iterator previosu method!");
	        Iterator<Course> it = courseList.iterator();
	        while (it.hasNext()){
	        	it.next().printCourseInfo();
	        }
	        
	       
	        
	        currentCourse=new Course();
	        currentCourse.setValue("MIS 999", "JAVA EE", "80", "3");
	        courseList.add(currentCourse);
	        it = courseList.iterator();
	        System.out.println("The new added Course is:");
	        int count=0;
	        while(it.hasNext()){
	        	count++;
	        	currentCourse=it.next();
	        	if(count==8){
	        		currentCourse.printCourseInfo();
	        	}
	        }
	        
	        
	        

	        inFile.close();
	    }

	    public static void DealData(String dataContent){
	        course_info=dataContent.split("	");
	    }
}
