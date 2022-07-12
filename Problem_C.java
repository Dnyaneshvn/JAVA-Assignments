package com.Assignment;

import java.util.Scanner;
public class Problem_C {
    public static void main(String[] args) {
// Q. Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner in = new Scanner(System.in);

        System.out.println("enter numbers when you bored then type 0 and see the SUM: ");
        int sum = 0;

        while (true) {
            int num = in.nextInt();

            if (num == 0) {
                break;
            } else {
                sum = num + sum;
            }
        }
        System.out.println(sum);
    }
}
