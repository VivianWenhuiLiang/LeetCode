package com.vivian.java.leetcode;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * 
 * For example, Given s = "Hello World", return 5.
 */
public class Q58_LengthofLastWord {
    public static int LengthofLastWord(String str) {
        if (str.isEmpty() || str == null) {
            return 0;
        }
        int count = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            if ('a' <= str.charAt(i) && str.charAt(i) >= 'z' || str.charAt(i) <= 'A' && str.charAt(i) >= 'Z') {
                count = count + 1;
            } else {
                return count;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println("Hello World");// 5
        System.out.println("Sing,good!");// 0
        System.out.println("Hello: Worl");// 4

    }

}
