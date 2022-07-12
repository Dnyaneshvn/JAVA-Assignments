package com.Assignment;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class FibonacciSeries {
    // Fibonacci series in java prorgram
    // its start from 0,1..
    // and add sum of previous two number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("which fibonacci number you need?");
        System.out.println("Enter index of fibo number: ");

        int n = in.nextInt();

        int a = 0;
        int b = 1;

        int count = 2;
        while (count<=n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }

        System.out.println();
    }
}
