package com.bridgelabz;

public class VowelOrConsonantUseSwitchCase {
    public static void main(String[] args) {
        String letter = "A";
        String lowerCase = letter.toLowerCase();
        switch (lowerCase){
            case "a" :
                System.out.println(letter+" is Vowel");
                break;
            case "e" :
                System.out.println(letter+" is Vowel");
                break;
            case "i" :
                System.out.println(letter+" is Vowel");
                break;
            case "o" :
                System.out.println(letter+" is Vowel");
                break;
            case "u" :
                System.out.println(letter+" is Vowel");
                break;

            default:
                System.out.println(letter +" is Consonant");
        }
    }
}
