package com.purabtech.java.interview;

import java.util.HashSet;

//Java Program to find longest substring without repetition| Amazon coding interview questions
public class LongestSubString {
	
	public static void main(String[] args) {
		String str="abcdab";//abcd
		
		System.out.println(Longest(str));
	}

	private static String Longest(String str) {
		HashSet<Character> set = new HashSet<>();
		String longestOverall="";
		String longestTillnow="";
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(set.contains(c)) {
				longestTillnow="";
				set.clear();
			}
			set.add(c);
			longestTillnow+=c;
			
			
			if(longestTillnow.length()>longestOverall.length()) {
				longestOverall=longestTillnow;
			}
		}
		return longestOverall;
		
	}

}
