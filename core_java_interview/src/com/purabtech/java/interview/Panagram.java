package com.purabtech.java.interview;

//Java Program to check given String is Panagram or not?
public class Panagram {
	
	public static void main(String[] args) {
		System.out.println("test");
		String s ="The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s.toLowerCase()));
	}

	private static boolean isPanagram(String s) {
		
		if(s.length()<26) {
			return false;
		} else {
			for(char ch='a';ch<='z';ch++) {				
				if(s.indexOf(ch) < 0) {
					return false;
				}
				System.out.println(ch);
			}
		}
		 
		return true;
		
	}
	
	

}
