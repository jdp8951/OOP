package com.company;
import java.util.*;
public class Assignment_4 {
	public static class  Bank{
		private float ROI;
		public float getROI(){
		return ROI;
		}

		public void setROI(float roi){
		this.ROI=roi;
		}
	}
		public static class SBI extends Bank{
			public SBI(){
				setROI(8.4f);
			}
		}
		public static class HDFC extends Bank{
			public HDFC(){
				setROI(7.3f);
			}
		}
		public static class ICICI extends Bank{
			public ICICI(){
				setROI(9.7f);
			}
		}
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner Sc=new Scanner(System.in);
float loan=500000f;
System.out.println("Enter the period in Years: ");
float Time=Sc.nextFloat();
SBI rahul=new SBI();
HDFC rohit= new HDFC();
ICICI rohan= new ICICI();
float rahul_Intrest=(rahul.getROI()*loan*Time)/100;
float rohan_Intrest=(rohan.getROI()*loan*Time)/100;
float rohit_Intrest=(rohit.getROI()*loan*Time)/100;

System.out.println("Rahul pays the Intrest of Rs. "+rahul_Intrest+" to SBI");
System.out.println("Rohan pays the Intrest of Rs. "+rohan_Intrest+" to ICICI");
System.out.println("Rohit pays the Intrest of Rs. "+rohit_Intrest+" to HDFC");

}

}