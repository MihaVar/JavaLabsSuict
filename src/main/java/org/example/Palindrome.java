package org.example;

public class Palindrome {
        public static boolean Palind(String str) {
            if(str == null || str.length() == 1 || str.isEmpty()) return false;
            return new StringBuilder(str).reverse().toString().replaceAll(" ", "").equalsIgnoreCase(str.replaceAll(" ", ""));
        }
}
