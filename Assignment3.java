package com.company;
import java.util.*;
public class Assignment3 {
	public static class assignment_3 {
	    String name,hobbie;
	    int Roll_number,GR_number;


	    assignment_3(String n, String h,int Rollno,int GRno)
	    {
	        this.name=n;
	        this.hobbie=h;
	        this.Roll_number=Rollno;
	        this.GR_number=GRno;
	    }

	    public int getGR()
	    {
	        return GR_number;
	    }


	    public String getName() {
	        return name;
	    }

	    public int getrollno()
	    {
	        return Roll_number;
	    }

	    public String gethobbie() {
	        return hobbie;
	    }


	}
	static class Student extends assignment_3
	{
	    String area_of_interest;
	    int marks;
	    Student(String n, String h, int Rollno, int GRno, String area_of_interest, int marks) {
	        super(n, h, Rollno, GRno); // Call the superclass constructor using super
	        this.area_of_interest = area_of_interest;
	        this.marks = marks;
	        }
	    public int getMarks()
	    {
	        return marks;
	    }
	    public String getarea_of_interest()
	    {
	        return area_of_interest;
	    }
	}
    public static void main(String[] args) {
        Student s=new Student("Jigar","Reading books",57,22210075,"technology",100);
        System.out.println("Name: " + s.getName());
        System.out.println("Hobby: " + s.gethobbie());
        System.out.println("Roll Number: " + s.getrollno());
        System.out.println("GR Number: " + s.getGR());
        System.out.println("Area of Interest: " + s.getarea_of_interest());
        System.out.println("Marks: " + s.getMarks());
    }
}
