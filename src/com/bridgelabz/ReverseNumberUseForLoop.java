package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberUseForLoop {
    public static void reverseNumber(int number){
        String word = String.valueOf(number);
        String [] array = word.split("");
       String [] tempArray=array;
        System.out.print("Number : ");
       for (int i =0;i< tempArray.length;i++){
           System.out.print(tempArray[i]+" ");
       }
        System.out.println();
        System.out.print("Reverse Number : ");
        for (int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        reverseNumber(number);
    }
}
