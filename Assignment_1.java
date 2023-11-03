package com.company;
import java.util.Scanner;
public class Assignment_1 {
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Students: ");
        n=Sc.nextInt();
        for(int i=0;i<n;i++){
            int s1,s2,s3,s4,s5;
            System.out.println("Enter the marks of subject s1");
            s1=Sc.nextInt();
            System.out.println("Enter the marks of subject s2");
            s2=Sc.nextInt();
            System.out.println("Enter the marks of subject s3");
            s3=Sc.nextInt();
            System.out.println("Enter the marks of subject s4");
            s4=Sc.nextInt();
            System.out.println("Enter the marks of subject s5");
            s5=Sc.nextInt();

            double avg_marks=(s1+s2+s3+s4+s5)/5.0;
            if(avg_marks>=80){
                System.out.println("Your Grade is A");
            } else if (avg_marks>=60&&avg_marks<80) {
                System.out.println("Your Grade is B");
            } else if (avg_marks>=40&&avg_marks<60) {
                System.out.println("Your Grade is C ");

            }else{
                System.out.println("Your Grade is D");
            }

        }



    }


}
