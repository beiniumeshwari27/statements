package com.codegnan.controlstatements;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scanner.nextInt();
		int sum=0;
		for(int i=num;i>0;i/=10) {
			int digit=i%10;
			sum+=digit;
		}
        System.out.println("sum of digits:"+sum);
	}

}
