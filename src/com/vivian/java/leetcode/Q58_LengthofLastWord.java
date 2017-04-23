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
    public int LengthofLastWord(String str) {
        if (str.isEmpty() || str == null) {
            return 0;
        }
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (isAlphabet(str.charAt(i))) {
                count = count + 1;
            } else {
                return count;
            }
        }
        return count;
    }

    public boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
    }
}
