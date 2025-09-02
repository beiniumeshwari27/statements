package com.codegnan.controlstatements;
import java.util.Scanner;
public class AtmExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner=new Scanner(System.in);
       double balance=60000;
       int pin=1234;
       System.out.println("enter your pin:");
       int enteredpin=scanner.nextInt();
       if(enteredpin!=pin) {
    	   System.out.println("Incorrect pin.Existing");
    	   return;
       }
      int choice;
      do {
    	  System.out.println("||=========||");
    	  System.out.println("||==== 1.Atm memu=====||");
    	  System.out.println("||==== 2.check balance=====||");
    	  System.out.println("||==== 3.withdraw=====||");
    	  System.out.println("||==== 3.withdraw=====||");
    	  System.out.println("||==== 4.Exit=====||");
          System.out.println("enter your choice");
          choice=scanner.nextInt();
          switch(choice) {
          case 1:
        	  System.out.println("your Balance is:"+balance);
        	  break;
          case 2:
        	  System.out.println("enter deposit Amount:");
        	  double depositAmount=scanner.nextDouble();
        	  if(depositAmount%100!=0) {
        		  System.out.println("please deposite multiples"+"Hunderd like[600,700]");
        		  
        	  }else {
        			  if(depositAmount<500){
        				  System.out.println("please deposite more than 500 rupees."+"minimum deposit is 500");
        			  }else {
        				  balance+=depositAmount;
        				  System.out.println("Deposit $"+depositAmount+"amount sucessfully.new balance is:"+balance);
        				  }
        		  }
        	  break;
          case 3:
        	  System.out.println("enter withdraw Amount:");
        	  double withdrawAmount=scanner.nextDouble();
        	  if(withdrawAmount%100!=0) {
        		  System.out.println("please deposit mutiples"+"Hundred like[600,700]");        			 
              }else {
        	       if(withdrawAmount<500){
				        System.out.println("please deposite more than 500 rupees."+"minimum deposit is 500");
			  }else {
				  if(withdrawAmount<=balance) {
					  balance-=withdrawAmount;
				  System.out.println("Deposit $"+withdrawAmount+"amount sucessfully.new balance is:"+balance);
			  }else {
				  System.out.println("insufficient funds");
        	  }
            }
      }
      break;
      case 4:
    	  System.out.println("Exiting.....thank you for using atm machine");
    	  break;
    	  default:
    		  System.out.println("invalid choice please choose avalid option between1 to 4");
	   }  
}while(choice!=4);
scanner.close();
          }
}
    	  
    			   
       
             
      


