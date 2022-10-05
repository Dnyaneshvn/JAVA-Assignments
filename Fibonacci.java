package com.start;

import java.util.Scanner;

public class Fibonacci {
    // fibonacci number is basically sum of previous two numbers.
    // and its starts from 0.
    // e.g. 0,1,1,2,3,5,8,13,....
    public static void main(String[] args) {
        //Q. Find nth fibo numbr 6
        Scanner in = new Scanner(System.in);
        // we need to find nth fibonacci num then we take a input n
        int n = in.nextInt();
        // fibo num start from 0 then we mention 0
        int a = 0;
        // after 0 fibo num gets 1
        // we mention 1
        int b = 1;
        // now, the count of that two is 2 then we mention count is 2
        int count =  2;
        // now, we don't know how many times loop will be run then we use While loop
        while(count<=n) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;

        }
        System.out.println(b);
    }
}
