package com.vivian.java.leetcode;

/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 */
public class Q125_ValidPalindrome {
    public boolean ValidPalindrome(String str) {
        if (str.isEmpty() || str == null) {
            return false;
        }
        char left;
        char right;
        for (int i = 0, j = str.length() - 1; i < j;) {
            left = str.charAt(i);
            right = str.charAt(j);
            if (!isNumber(left) && !isAlphabet(left)) {
                i++;
                continue;
            }
            if (!isNumber(right) && !isAlphabet(right)) {
                j--;
                continue;
            }
            if (!equalsIgnoresCase(left, right)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isNumber(char c) {
        return (c >= '0' && c <= '9');
    }

    public boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
    }

    public boolean equalsIgnoresCase(char left, char right) {
        return (left == right || left - 'a' == right - 'A' || left - 'A' == right - 'a');
    }
}
