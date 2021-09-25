package com.purabtech.java.interview;

//Best time to buy and sell stock with Example in Java || Java Array Coding Interview Questions
public class StockBuyAndSell {
	
	public static void main(String[] args) {
		int array[]= {10,20,5,80,100};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			
			if(array[i]-min>max) {
				max=array[i]-min;
			}
		}
		System.out.println("Max value="+max);
	}

	
}
