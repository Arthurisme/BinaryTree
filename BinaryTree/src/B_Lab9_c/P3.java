package B_Lab9_c;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;


public class P3 {
	static String[] course_info=new String[4];
	
	
	 public static void main(String[] args) throws FileNotFoundException {
	        // TODO code application logic here
		 
	        
	        Course currentCourse;
	        
	        Vector<Course> courseList = new Vector<Course>();

	        Scanner inFile = new Scanner(new FileReader("Course.in"));

	        while(inFile.hasNext()){
	        	currentCourse=new Course();
	        	DealData(inFile.nextLine());
	        	currentCourse.setValue(course_info[0],course_info[1] , course_info[3],course_info[2]);
		        
	        	courseList.add(currentCourse);
	        	
	        }
	        
	        System.out.println();
	        System.out.println("CourseList size="+courseList.size());
	        for(int i=0;i<courseList.size();i++){
	        	courseList.get(i).printCourseInfo();
	        }
	        
	        System.out.println("ListIterator next method!");
	        ListIterator<Course> it = courseList.listIterator();
	        while (it.hasNext()){
	        	it.next().printCourseInfo();
	        }
	        System.out.println("ListIterator previosu method!");
	        while (it.hasPrevious()){
	        	
	        	it.previous().printCourseInfo();
	        }	
	        
	        currentCourse=new Course();
	        currentCourse.setValue("MIS 999", "JAVA EE", "80", "3");
	        //courseList.add(2, currentCourse);
	        it.add(currentCourse);
	        System.out.println("The new added Course is:");
	        it.previous().printCourseInfo();
	        
	        

	        inFile.close();
	    }

	    public static void DealData(String dataContent){
	        course_info=dataContent.split("	");
	    }
}
