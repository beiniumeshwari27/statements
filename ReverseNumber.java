package com.codegnan.controlstatements;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number:");
		int number=scanner.nextInt();
		if(number<0) {
			number=-number;
		}
		int originalNumber=number;
		int reversedNumber=0;
		while(number!=0) {
			int reminder=number%10;
			reversedNumber=reversedNumber*10 +reminder;
			number/=10;
		}
		System.out.println("Reverse of a number:"+originalNumber+"is"+reversedNumber);
	}

}
