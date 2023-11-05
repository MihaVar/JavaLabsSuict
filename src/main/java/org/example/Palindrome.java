package org.example;

public class Palindrome {
    public static boolean Palind(String str) {
        str = str.replaceAll("\\s", "").toLowerCase();

        String str2 = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            str2 += str.toCharArray()[i];
        }
        return str.equals(str2);
    }
}
