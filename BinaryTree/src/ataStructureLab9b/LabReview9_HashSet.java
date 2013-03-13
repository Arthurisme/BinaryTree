package ataStructureLab9b;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class LabReview9_HashSet {

static Scanner console=new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException {	

        Scanner inFile = new Scanner(new FileReader("data\\Course.in"));

        String str;
        int i=0;
        String[] s = new String[4];
        Course[] myCourse = new Course[7];  
        HashSet<Course> al=new HashSet<Course>();
          
        while (inFile.hasNextLine()) {
            str = inFile.nextLine();
            s = str.split(","); 
            myCourse[i]=new Course();
            myCourse[i].setCourse_no(s[0]);
            myCourse[i].setCourse_name(s[1]);
            myCourse[i].credits = Integer.parseInt(s[2]);
            myCourse[i].setMac_enrl(Integer.parseInt(s[3]));
            al.add(myCourse[i]);
            i++;
        } 
        
        System.out.println("The course you entered are: ");
        System.out.println(al.size());        

        
        System.out.println("\nUsing method Iterator.next():");  
        
       Iterator<Course> iterator=al.iterator();
        while(iterator.hasNext())		
        	iterator.next().print();    

      
        Course record=new Course("MIS 999","JAVA EE",80);
        al.add(record);     
    
        inFile.close();
        

        
	


}


	



	
	
	
}
