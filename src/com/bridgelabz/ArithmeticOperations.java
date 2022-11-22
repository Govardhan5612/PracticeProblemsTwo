package com.bridgelabz;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void arithmeticProblems(int a,int b,int c){
//        i) a+b*c ii) c+a/b
//        iii) a%b+c iV) a*b+c
        System.out.println("i) a+b*c : "+(a+b*c));
        System.out.println("ii) c+a/b : "+(c+a/b));
        System.out.println("iii) a%b+c : "+(a%b+c));
        System.out.println("iv) a*b+c : "+(a*b+c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'a' value : ");
        int a = input.nextInt();
        System.out.print("Enter 'b' value : ");
        int b = input.nextInt();
        System.out.print("Enter 'c' value : ");
        int c = input.nextInt();
        arithmeticProblems(a,b,c);
    }
}
