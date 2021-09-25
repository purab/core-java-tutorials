package com.purabtech.java.interview;

import java.util.HashSet;

//how to find two array intersection
public class Intersection {
	
	public static void main(String[] args) {
		int arr1[]= {4,1,2,3};
		int arr2[]= {5,4,7,8};
		
		printInterSection(arr1,arr2);
	}

	private static void printInterSection(int[] arr1, int[] arr2) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			if(hs.contains(arr2[i])) {
				System.out.println(arr2[i]);
			} 
			
			hs.add(arr2[i]);
		}
		
	}

	

}
