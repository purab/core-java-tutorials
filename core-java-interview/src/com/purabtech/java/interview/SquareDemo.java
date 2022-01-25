package com.purabtech.java.interview;

import java.util.Scanner;

public class SquareDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        Integer num= sc.nextInt();
        for(int i=1;i<num;i++) {
            if(i*i==num) {
                System.out.println("Given number is square of "+i);
                return;
            }
        }
    }
}
