package com.codegnan.controlstatements;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		int number=scanner.nextInt();
		long result=1;
		for(int i=1;i<=number;i++) {
			result*=i;
			}
		System.out.println("factorial:"+number+"is"+result);
	}

}
