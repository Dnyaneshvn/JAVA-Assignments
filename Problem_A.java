package com.Assignment;

import java.util.Scanner;

public class Problem_A {
    // Q. Subtract the Product and Sum of Digits of an Integer
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any value , for e.g. abc then we do : a*b*c - a+b+c");
        System.out.print("Enter value: ");
        int num = in.nextInt();

        int prod = 1;
        int sum = 0;
        int sub = 0;
        while (num!=0) {
            int rem = num % 10;

            prod = prod * rem;
            sum = sum + rem;

            sub = prod - sum;
            num = num/10;


        }
        System.out.println(" prod - sum " + "of that value is "+sub);
    }
}
