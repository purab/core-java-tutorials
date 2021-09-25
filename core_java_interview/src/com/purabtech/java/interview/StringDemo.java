package com.purabtech.java.interview;

import java.util.Scanner;

//Java Program to find the number of occurences of character
public class StringDemo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sting here");		
		String str= sc.nextLine();
		int intialLength=str.length();		
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the charactor to find first occurence of char");
		String str1= sc1.next();
		
		str=str.replace(str1, "");
		int finalLength=str.length();
		System.out.println("Total number of occurence of character "+str1 +": " +(intialLength-finalLength));
	}
}
