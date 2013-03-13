package ataStructureLab9b;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;


public class LabReview9_HashMap {

static Scanner console=new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {	

        Scanner inFile = new Scanner(new FileReader("data\\Course.in"));

        String str;
        int i=0;
        String[] s = new String[4];
        Course[] myCourse = new Course[7];  
        HashMap<String,Course> al=new HashMap<String,Course>();
          
        while (inFile.hasNextLine()) {
            str = inFile.nextLine();
            s = str.split(","); 
            myCourse[i]=new Course();
            myCourse[i].setCourse_no(s[0]);
            myCourse[i].setCourse_name(s[1]);
            myCourse[i].credits = Integer.parseInt(s[2]);
            myCourse[i].setMac_enrl(Integer.parseInt(s[3]));
            al.put(myCourse[i].getCourse_no(),myCourse[i]);
            i++;
        } 
        
        System.out.println("The course you entered are: ");
        System.out.println(al.size());
        
        System.out.println("\nUsing method get():");   
        al.get("MIS_441").print();
        
        System.out.println("\nUsing method keySet():");        
        Iterator<String> iterator=al.keySet().iterator();
        while(iterator.hasNext())		
        	al.get(iterator.next()).print();   
   
        System.out.println("\nUsing method values():");   
        Collection<Course> c=al.values();
        Iterator<Course> iterator1=c.iterator();
        while(iterator1.hasNext())	
        	iterator1.next().print();     
    
        inFile.close();
        

        
	


}


	



	
	
	
}
