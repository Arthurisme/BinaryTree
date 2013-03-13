package B_Lab9_c;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class P5 {
	static String[] course_info=new String[4];
	
	
	 public static void main(String[] args) throws FileNotFoundException {
	        // TODO code application logic here
		 
	        
	        Course currentCourse;
	        
	        HashMap courseList = new HashMap();

	        Scanner inFile = new Scanner(new FileReader("Course.in"));

	        while(inFile.hasNext()){
	        	currentCourse=new Course();
	        	DealData(inFile.nextLine());
	        	currentCourse.setValue(course_info[0],course_info[1] , course_info[3],course_info[2]);
		        
	        	courseList.put(course_info[0], currentCourse);
	        	
	        }
	        
	        System.out.println();
	        System.out.println("CourseList size="+courseList.size());
	        
	        
	        currentCourse=(Course) courseList.get("MIS 441");
	        System.out.println("Search Result:");
	        currentCourse.printCourseInfo();
	        
	        System.out.println("*********************************");
	        System.out.println("Print by keyset method");
	        Iterator i1=courseList.keySet().iterator();
	        while(i1.hasNext()){
	        	currentCourse=(Course) courseList.get(i1.next());
		        
		        currentCourse.printCourseInfo();
	        }
	        
	        System.out.println("*********************************");
	        System.out.println("Print by values method");
	        Set set=courseList.entrySet();
	        Iterator i=set.iterator();
	        
	        while(i.hasNext()) {
	        	Map.Entry me = (Map.Entry)i.next();
	        	System.out.print(me.getKey() + ": ");
	        	currentCourse=(Course) me.getValue();
	        	
	        	currentCourse.printCourseInfo();
	        	} 
	        System.out.println("*********************************");
	        Collection ct1=courseList.values();
	        i=ct1.iterator();
	        while(i.hasNext()){
	        	currentCourse=(Course)i.next();
	        	currentCourse.printCourseInfo();
	        }
	        
	        

	        inFile.close();
	    }

	    public static void DealData(String dataContent){
	        course_info=dataContent.split("	");
	    }
}
