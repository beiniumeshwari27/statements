package com.codegnan.controlstatements;
import java.util.Scanner;
public class WelcomeMessage {

	public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);
          System.out.println("enter city name:");
          String city=scanner.next();
          if(city.equalsIgnoreCase("hyderabad")) {
        	  System.out.println("Hello Hyderabai.....addai");
          }else {
        	  if(city.equalsIgnoreCase("banglore")) {
        		  System.out.println("Hello kannadiga..namaskar");
        	  }else {
        		  if(city.equalsIgnoreCase("chennai")) {
        			  System.out.println("Hello madrasi..vanakkam..");
        		  }else {
        			 System.out.println("Enter valid city name");
        			
        		  }
        	  }
          }
          scanner.close();

	}

}
