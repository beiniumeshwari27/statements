package com.codegnan.controlstatements;
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scanner.nextInt();
		int count=0;
		for(int i=num;num!=0;num/=10) {
			count++;
		}
		System.out.println("Number Of digits is = "+count);
		scanner.close();
		

	}

}
