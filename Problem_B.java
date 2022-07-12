package com.Assignment;

import java.util.Scanner;

public class Problem_B {
    // Q. Input a number and print all the factors of that number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter any number, we show you factor of that number: ");
        int num= in.nextInt();
        System.out.println("factors are :");
        for (int i =1; i<=num;i++) {
            // if number is divided by i then this is the factor of that number.
            if(num%i==0) {
                System.out.print(" " + i);
            }
        }
    }
}
