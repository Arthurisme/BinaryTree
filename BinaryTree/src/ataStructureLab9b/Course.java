package ataStructureLab9b;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author ContEd Student
 */
public class Course {
    private String course_no;
    private String course_name;
    private int max_enrl;
    public static int credits;


    
    public Course() {
		//super();
	}

	public Course(String course_no, String course_name, int max_enrl) {		
		this.course_no = course_no;
		this.course_name = course_name;
		this.max_enrl = max_enrl;
	}

	public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setCourse_no(String course_no) {
        this.course_no = course_no;
    }

    public void setMac_enrl(int mac_enrl) {
        this.max_enrl = mac_enrl;
    }
    
    

    public String getCourse_no() {
		return course_no;
	}

	public String getCourse_name() {
		return course_name;
	}

	public int getMax_enrl() {
		return max_enrl;
	}

	public static int getCredits() {
		return credits;
	}

	public void print(){
                System.out.println("Course Code: "+course_no+", Course Name: "+
                course_name+", Credits: "+credits+", Max enrolled: "+max_enrl);
    }




}
