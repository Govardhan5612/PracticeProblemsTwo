package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month ; ");
        int month = input.nextInt();
        System.out.print("Enter day ; ");
        int day = input.nextInt();
        if (month==3 && (day>=20 && day<=31)){
            System.out.println("March - day "+day);
        }
       else if (month==4 && (day>=1 && day<=30)){
            System.out.println("April - day "+day);
        }
       else if (month==5 && (day>=1 && day<=31)){
            System.out.println("May - day "+day);
        }
        else if (month==6 && (day>=1 && day<=20)){
            System.out.println("March - day "+day);
        }
        else {
            System.out.println("Enter valid details");
        }
    }
}
