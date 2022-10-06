package com.start;

public class MaxNumInList {
    public static void main(String[] args) {

        // Q. in the list, find out how many time some of the number is are repeated.
        // e.g. 1,3,8,5,7,5,7,8,7,7
        // in the above problem find out how many time 7 will be repeated.
        int n = 455557;

        int count = 0;
        while(n>0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);


    }
}
