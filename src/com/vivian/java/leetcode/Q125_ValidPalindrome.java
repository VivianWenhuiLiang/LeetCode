package com.vivian.java.leetcode;

/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 */
public class Q125_ValidPalindrome {
    public boolean validPalindrome(String str) {
        if (str.isEmpty() || str == null) {
            System.out.println("not a palindrome");
            return false;
        }
        char left;
        char right;
        for (int i = 0, j = str.length() - 1; i < j;) {
            left = str.charAt(i);
            right = str.charAt(j);
            if (!isAlphabet(left) && !isNumber(left)) {
                i++;
                continue;
            }
            if (!isAlphabet(right) && !isNumber(right)) {
                j--;
                continue;
            }
            if (!equalsIgnoresCases(left, right)) {
                System.out.println("not a palindrome");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("it is a palindrome");
        return true;
    }

    public boolean isAlphabet(char c) {
        return ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z');
    }

    public boolean isNumber(char c) {
        return ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z');
    }

    public boolean equalsIgnoresCases(char a, char b) {
        return (a == b || a - 'A' == b - 'a' || a - 'a' == b - 'A');
    }

    public static void main(String[] args) {
        Q125_ValidPalindrome vp = new Q125_ValidPalindrome();
        vp.validPalindrome("A man a plan a canal;Panama");
        vp.validPalindrome("race a car");
        return;
    }

}
