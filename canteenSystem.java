package com.codegnan.controlstatements;
import java.util.Scanner;
public class canteenSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int teaPrice=10,cofeePrice=15,samosaPrice=20;
		int teaQty=0,coffeQty=0,samosaQty=0;
		int choice;
		double taxRate=0.05;
		do {
			System.out.println("||======Canteen Menu=====||");
			System.out.println("||======1.View Menu=====||");
			System.out.println("||======2.Order Items=====||");
			System.out.println("||======3.View Bill=====||");
			System.out.println("||======4.CheckOut and Exit=====||");
			System.out.println("enter your Choice");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("-------MENU------");
				System.out.println("1.Tea-$"+teaPrice);
				System.out.println("2.Coff-$"+cofeePrice);
				System.out.println("3.Samosa-$"+samosaPrice);
				break;
			case 2:
				System.out.println("enter to Number to order(1-3)");
				int item=scanner.nextInt();
				System.out.println("enter Quantity");
				int qty=scanner.nextInt();
				if(qty<=0) {
					System.out.println("Quantity must Greater than 0");
					break;
				}
				switch(item) {
				case 1:
					teaQty+=qty;
				    System.out.println(qty+"Tea(s) Added");
				    break;
				    case 2:
				    	coffeQty+=qty;
				    	System.out.println(qty+"coff(s)Added");
				    	break;
				    case 3:
				    	samosaQty+=qty;
				    	System.out.println(qty+"Samosa(s) Added");
				    	break;
				    	default:
				    		System.out.println("Invaild Item Number.Please Choice between 1to3");
				    		break;
				}
				break;
			case 3:
				int teaTotal=teaPrice;
				int cofeeTotal=coffeQty*cofeePrice;
				int samosaTotal=samosaQty*samosaPrice;
				int subTotal=teaTotal+cofeeTotal+samosaTotal;
				double tax=subTotal*taxRate;
				double grandTotal=subTotal+tax;
				System.out.println("=====BILL======");
				if(teaQty>0) {
					System.out.println("Tea x"+teaQty+"$"+teaTotal);
				}if(coffeQty>0) {
					System.out.println("Tea x"+coffeQty+"$"+cofeeTotal);
				}if(samosaQty>0) {
					System.out.println("Tea x"+samosaQty+"$"+samosaTotal);
				}
				if(subTotal==0) {
					System.out.println("no item order yet");
				}else {
					System.out.println("SubTotal="+subTotal);
					System.out.println("Tax(5%)="+tax);
					System.out.println("Grand Total="+grandTotal);
				}
				break;
			case 4:
				System.out.println("Thank You!.Existing System");
				break;
				default:
					System.out.println("Invalid Choice.Please Enter A number 1 to 4");
					break;		
			}	
		}while(choice!=4);
		scanner.close();
				
	}

}
