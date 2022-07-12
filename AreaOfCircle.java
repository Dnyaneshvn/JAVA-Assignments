package com.Assignment;

import java.util.Scanner;

public class AreaOfCircle {
    // Q. Find Area of Circle
    // formula is a = pi*r^2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double pi = 3.414;
        System.out.print("Enter Radius of the circle: ");
        int r = in.nextInt();

        double area = pi*r*r;
        System.out.print("Area of the Circle is: ");
        System.out.println(area);

    }

}
