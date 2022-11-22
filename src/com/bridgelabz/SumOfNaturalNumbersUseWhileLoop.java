package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumbersUseWhileLoop {
    public static void addNaturalNumbers(int number){
        int sum=0;
        int i = 1;
        System.out.println("Natural numbers are : ");
        while ( i<= number){
            System.out.print(i+" ");
            sum=sum+i;
            i++;
        }
        System.out.println();
        System.out.println("Sum of natural numbers : "+sum);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the natural number : ");
        int number = input.nextInt();
        addNaturalNumbers(number);
}
}
