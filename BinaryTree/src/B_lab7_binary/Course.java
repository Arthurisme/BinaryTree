/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package B_lab7_binary;

/**
 *
 * @author ContEd Student
 */
public class Course {

    private String course_no;
    private String course_name;
    private int max_enrl;
    public static int credits;
    
    
   
	public String getCourse_no() {
		return course_no;
	}

	public void setCourse_no(String course_no) {
		this.course_no = course_no;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getMax_enrl() {
		return max_enrl;
	}

	public void setMax_enrl(int max_enrl) {
		this.max_enrl = max_enrl;
	}

	public static int getCredits() {
		return credits;
	}

	public static void setCredits(int credits) {
		Course.credits = credits;
	}

	//method to set the value
    public void setValue(String wcourse_no,String wcourse_name,String wmax_enrl){
        course_no=wcourse_no;
        course_name=wcourse_name;
        max_enrl=Integer.parseInt(wmax_enrl);
    }

    //calculate the total fees


    public void printCourseInfo(){
        System.out.println("The Course Information is : "+course_no+"//"+course_name+"//"+
                credits+"//"+max_enrl+"\n");
    }

}
