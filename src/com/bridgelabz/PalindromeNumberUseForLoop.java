package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNumberUseForLoop {

    public static void palindromeNumber(int number){

        String numberWord = String.valueOf(number);
        System.out.println("Number : "+numberWord);
        String []numberArray =numberWord.split("");
        String reverse="";
        for (int i=numberArray.length-1;i>=0;i--){
            reverse=reverse+numberArray[i];
        }
        System.out.println("Reverse Number : "+reverse);
        if(numberWord.equals(reverse)){
            System.out.println(number+" is palindrome number");
        }
        else {
            System.out.println(number+" is not palindrome number");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();
        palindromeNumber(number);
    }
}
