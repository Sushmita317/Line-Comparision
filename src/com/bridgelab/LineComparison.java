package com.bridgelab;

import java.util.Scanner;

public class LineComparison {
     //Author-Sushmita

    // Method to find the length of line by taking co-ordinates from user.
    public double findLength() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of X1 co-ordinate");
        int x1 = sc.nextInt();
        System.out.println("Enter value of X2 co-ordinate");
        int x2 = sc.nextInt();
        System.out.println("Enter value of Y1 co-ordinate");
        int y1 = sc.nextInt();
        System.out.println("Enter value of Y2 co-ordinate");
        int y2 = sc.nextInt();

        // Finding length of line.
        double lenght_of_line = Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
        System.out.println("Lenght of line is " + lenght_of_line);
        return lenght_of_line;
    }

    // Checking whether two lines are equal are not.
    public void checkEquality() {
        double line1 = findLength();
        System.out.println("Enter co-ordinates for second line");
        double line2 = findLength();

        if (line1 == line2)
            System.out.println("Two lines are equal");
        else
            System.out.println("Two lines are not equal");

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line comparison Computation program");
        LineComparison lineCompare = new LineComparison();
        lineCompare.checkEquality();

    }

}