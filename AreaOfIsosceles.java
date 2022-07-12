package com.Assignment;

import java.util.Scanner;

public class AreaOfIsosceles {
    // Q. Area of Isoscels triangle
    // formula is breadth*height/2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter breadth: ");
        double b = in.nextInt();
        System.out.println("Enter Height: ");
        double h = in.nextInt();

        double area =  b*h/2;
        System.out.println("Area of Isosceles: " + area);
    }
}
