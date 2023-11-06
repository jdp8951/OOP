package com.company;
import java.util.Scanner;
public class Assignment_2 {
	String name;
	int id;
	String DOB;
	String bg;
	public Assignment_2(String name, int id, String DOB, String bg)
	{
		this.name=name;
		this.id=id;
		this.DOB=DOB;
		this.bg=bg;		
	}
	public static void main(String[] args) {
		int np=2;//np=Number of Patients		
		Assignment_2 patient[]=new Assignment_2[10];				
		String name,DOB,bg;	
		int id;
		for (int l=1;l<=np;l++){
		System.out.println("Enter Patient details::"+l+":");
		System.out.println("Name:-");
	    Scanner s=new Scanner(System.in);	
	    name=s.nextLine();
		System.out.println("ID:-");
		id=s.nextInt();
		System.out.println("DOB:-");
		DOB=s.next();
		System.out.println("Background:-");
		bg= s.next();
		Assignment_2 p=new Assignment_2(name,id,DOB,bg);
		patient[l]=p;
		}    
		for (int j=1;j<=np;j++)
		{
    	   Assignment_2 pp=patient[j];
    	   System.out.println("Details of patient"+j+": " );
    	   System.out.println("Name:-"+pp.name); 
    	   System.out.println("ID:-"+pp.id);
    	   System.out.println("DOB:-"+pp.DOB);
    	   System.out.println("Background:-"+pp.bg);
    	   System.out.println();
    	   
		}
	}
}

