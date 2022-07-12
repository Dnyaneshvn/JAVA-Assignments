package com.Assignment;

import java.util.Scanner;

public class AreaOfTriangle {
    // Q. find Area of Triangle
    // formula is height*breadth/2
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Height of the Triangle: ");
        double height = in.nextInt();
        System.out.print("Enter Weidth of the Triangle: ");
        double weidth = in.nextInt();

        double area = height*weidth/2;

        System.out.print("Area of the Triangle is "+area);
    }

}
