package com.company;
import java.util.*;
class myexp extends Exception{
	
}
public class Assignment_5{
	    public static void main(String[] args) {
	        String city;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the city in which you live");
	        city = sc.next();

	        String[] arr = { "bangalore", "mumbai", "chennai", "pune" };
	        String s1;
	        System.out.println("do you have a four wheeler");
	        s1 = sc.next();
	        int fw = 0;
	        String s2 = "yes";
	        if (s1.equals(s2)) {
	            fw = 1;
	        }

	        int cnt = 0;
	        for (String s : arr) {
	            if (city.equals(s)) {
	                cnt = 1;
	                break;
	            }
	        }

	        try {
	            if (cnt == 1 || fw == 1) {
	                throw new myexp();
	            }
	            else{
	                System.out.println("no exception occured");
	            }
	        }
	        catch (myexp ex) {
	            System.out.println("exception occured, either change city or the vehicle");
	            
	        	}
	        }
	}