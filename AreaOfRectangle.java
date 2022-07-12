package com.Assignment;

import java.util.Scanner;

public class AreaOfRectangle {
    // Q. find area of rectangle
    // formula is lenght*weidth
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double l = in.nextInt();
        System.out.print("Enter Weidth: ");
        double w = in.nextInt();

        double area = l*w;
        System.out.print("Area of Rectangle is " + area);
    }
}
