package com.bridgelabz;

import java.util.Scanner;

public class AddNaturalNumbersUseForLoop {
    public static void sumOfNaturalNumbers(int number){
        int sum = 0;
        for (int i =1;i<=number;i++){
            sum=sum+i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("sum of natural numbers : "+sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        sumOfNaturalNumbers(number);
    }
}
