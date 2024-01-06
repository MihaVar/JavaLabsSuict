package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your word: ");
        Scanner word = new Scanner(System.in);
        String str = word.nextLine();

        if (Palindrome.Palind(str)) {
            System.out.println("It's a palindrome!");
        }
        else {
            System.out.println("It's not a palindrome!");
        }
    }

}