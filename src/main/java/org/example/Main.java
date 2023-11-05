package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String str = word.nextLine();

        System.out.println("Enter your word: ");
        if (Palindrome.Palind(str)) {
            System.out.println("Its palindrome");
        }
        else {
            System.out.println("Its not a palindrome");
        }
    }

}