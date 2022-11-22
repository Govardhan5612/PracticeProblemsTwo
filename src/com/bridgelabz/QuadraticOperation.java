package com.bridgelabz;

import java.util.Scanner;

public class QuadraticOperation {
//    Root 1 of x = (-b + sqrt(delta))/(2*a)
//    Root 2 of x = (-b - sqrt(delta))/(2*a)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        double a =input.nextDouble();
        System.out.print("Enter b value : ");
        double b=input.nextDouble();
        System.out.print("Enter c value : ");
        double c=input.nextDouble();
        double delta = (b*b)-(4*a*c);
        System.out.println("Delta value is : "+delta);
        if ( delta >0){
            double root1 = (-b+ Math.sqrt(delta))/(2*a);
            double root2 = (-b- Math.sqrt(delta))/(2*a);
            System.out.println("Roots of x are : "+root1+" and "+root2);
        } else if (delta==0) {
            double root = (-b)/(2*a);
            System.out.println("Roots of x are : "+root+" and "+root);
        }
        else {
            System.out.println("roots are not real");
        }
    }
}
