package com.bridgelabz;

import java.util.Scanner;

public class ReverseIntegerNumberUseWhileLoop {
    public static void reverseNumber(int number){
       int reverse = 0;
       int remainder = 0;

       while ( number !=0){
           remainder = number%10;
           reverse=reverse*10+remainder;
           number=number/10;
       }
        System.out.println("Reverse number is "+reverse);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();
        reverseNumber(number);
    }
}
