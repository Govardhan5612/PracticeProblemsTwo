package com.bridgelabz;

import java.util.Scanner;

public class CalculateDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x value : ");
        double x = input.nextDouble();
        System.out.print("Enter y value : ");
        double y = input.nextDouble();
        double distance = Math.sqrt((x*x)+(y*y));
        System.out.println("Euclidean distance is  "+distance);
    }
}
